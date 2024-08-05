package com.latte.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserSecurityService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    // UserDetailsService 구현으로 인해 강제된 메서드
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        // Optional -> null 값을 반환할 수 있음을 명시, NullPointerException 방지
        Optional<User> _user = this.userRepository.findById(id);

        if (_user.isEmpty()) {
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다.");
        }
        User user = _user.get();

        List<GrantedAuthority> authorityList = new ArrayList<>();
        if (id.contains("admin")) {
            authorityList.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
        } else {
            authorityList.add(new SimpleGrantedAuthority(UserRole.USER.getValue()));
        }

        // UserDetails를 구현한 CustomUserDetails 사용
        // UserDetails는 id와 pwd 외에 저장이 불가하기 때문에
        // 추가적인 정보를 저장하고 싶으면 UserDetails를 구현하여 커스텀해야한다.
        return new CustomUserDetails(user, authorityList);
        // 해당 클래스에는 비밀번호가 사용자로부터 입력받은 값과 일치하는지
        // 검사하는 기능이 내장되어 있다.
    }
}
