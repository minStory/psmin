package com.cinema.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class LatteDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";

	private static LatteDAO instance = null;

	private LatteDAO() {
	}

	public static LatteDAO getInstance() {

		if (instance == null) {
			instance = new LatteDAO();
		}

		return instance;
	}

	public void openConn() {

		try {
			Context initCtx = new InitialContext();
			Context ctx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) ctx.lookup("jdbc/mysql");
			con = ds.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeConn(ResultSet rs, PreparedStatement pstmt, Connection con) {

		try {

			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConn(PreparedStatement pstmt, Connection con) {

		try {

			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원가입 메서드
	public int insertMember(MemberDTO dto) {

		int result = 0;
		int count = 0;

		try {
			openConn();

			sql = "select count(*) from member";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1) + 1;
			}

			// 회원번호 M20240527001, M20240527010, M20240527100 과 같이
			// 맨 뒤의 3자리를 맞추기 위한 코드
			if (count < 100) {
				dto.setMember_no(dto.getMember_no() + "0");
			}

			if (count < 10) {
				dto.setMember_no(dto.getMember_no() + "0");
			}

			dto.setMember_no(dto.getMember_no() + count);

			sql = "insert into member values(?, ?, ?, ?, ?, ?, default, default, default)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMember_no());
			pstmt.setString(2, dto.getMember_id());
			pstmt.setString(3, dto.getMember_pwd());
			pstmt.setString(4, dto.getMember_name());
			pstmt.setString(5, dto.getMember_phone());
			pstmt.setString(6, dto.getMember_email());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return result;
	}

	// 회원 로그인 시 id와 pwd를 검증하는 메서드
	public int checkMemberLogin(MemberDTO dto) {

		int result = 0;

		try {
			openConn();

			sql = "select * from member where member_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getMember_id());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString("member_pwd").equals(dto.getMember_pwd())) {
					result = 1;
				} else {
					result = -1;
				}
			} else {
				result = 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return result;
	}

	// 검증된 회원의 id로 모든 데이터를 조회하는 메서드
	public MemberDTO getMemberInfo(String id) {

		MemberDTO dto = null;

		try {
			openConn();

			sql = "select * from member where member_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new MemberDTO();
				dto.setMember_no(rs.getString("member_no"));
				dto.setMember_id(rs.getString("member_id"));
				dto.setMember_pwd(rs.getString("member_pwd"));
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_phone(rs.getString("member_phone"));
				dto.setMember_email(rs.getString("member_email"));
				dto.setMember_mileage(rs.getInt("member_mileage"));
				dto.setMember_grade(rs.getString("member_grade"));
				dto.setMember_signup_date(rs.getString("member_signup_date"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return dto;
	}

	// 회원번호로 모든 데이터를 조회하는 메서드
	public MemberDTO getMemberInfoByNo(String no) {

		MemberDTO dto = null;

		try {
			openConn();

			sql = "select * from member where member_no = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new MemberDTO();
				dto.setMember_no(rs.getString("member_no"));
				dto.setMember_id(rs.getString("member_id"));
				dto.setMember_pwd(rs.getString("member_pwd"));
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_phone(rs.getString("member_phone"));
				dto.setMember_email(rs.getString("member_email"));
				dto.setMember_mileage(rs.getInt("member_mileage"));
				dto.setMember_grade(rs.getString("member_grade"));
				dto.setMember_signup_date(rs.getString("member_signup_date"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return dto;
	}

	// 로그인 아이디가 관리자 계정에 속하는지 확인하는 메서드
	public boolean checkBelongToAdmin(String id) {

		boolean result = false;

		try {
			openConn();

			sql = "select * from admin where admin_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return result;
	}

	// 관리자 로그인 시 id와 pwd를 검증하는 메서드
	public int checkAdminLogin(AdminDTO dto) {

		int result = 0;

		try {
			openConn();

			sql = "select * from admin where admin_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getAdmin_id());

			rs = pstmt.executeQuery();

			if (rs.next()) {
				if (rs.getString("admin_pwd").equals(dto.getAdmin_pwd())) {
					result = 1;
				} else {
					result = -1;
				}
			} else {
				result = 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return result;
	}

	// 검증된 관리자의 id로 모든 데이터를 조회하는 메서드
	public AdminDTO getAdminInfo(String id) {

		AdminDTO dto = null;

		try {
			openConn();

			sql = "select * from admin where admin_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new AdminDTO();
				dto.setAdmin_no(rs.getString("admin_no"));
				dto.setAdmin_id(rs.getString("admin_id"));
				dto.setAdmin_pwd(rs.getString("admin_pwd"));
				dto.setAdmin_name(rs.getString("admin_name"));
				dto.setAdmin_job(rs.getString("admin_job"));
				dto.setAdmin_phone(rs.getString("admin_phone"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return dto;
	}

	// 모든 공지사항 게시글을 조회하는 메서드
	public List<NoticeBoardDTO> getNoticeBoardList() {

		List<NoticeBoardDTO> list = new ArrayList<>();

		try {
			openConn();

			sql = "select * from notice_board order by notice_board_no desc";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				NoticeBoardDTO dto = new NoticeBoardDTO();

				dto.setNotice_board_no(rs.getInt("notice_board_no"));
				dto.setNotice_board_writer_no(rs.getString("notice_board_writer_no"));
				dto.setNotice_board_writer_id(rs.getString("notice_board_writer_id"));
				dto.setNotice_board_title(rs.getString("notice_board_title"));
				dto.setNotice_board_content(rs.getString("notice_board_content"));
				dto.setNotice_board_file(rs.getString("notice_board_file"));
				dto.setNotice_board_created_date(rs.getString("notice_board_created_date"));
				dto.setNotice_board_updated_date(rs.getString("notice_board_updated_date"));
				dto.setNotice_board_hit(rs.getInt("notice_board_hit"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return list;
	}

	// 모든 공지사항 게시글을 조회하는 메서드 페이징 전용 오버로딩
	public List<NoticeBoardDTO> getNoticeBoardList(int page, int rowsize) {

		List<NoticeBoardDTO> list = new ArrayList<>();

		// 해당 페이지에서 시작 번호
		int startNo = (page * rowsize) - (rowsize - 1);

		// 해당 페이지에서 끝 번호
		int endNo = (page * rowsize);

		try {
			openConn();

			sql = "SELECT * FROM (SELECT @row_number:=@row_number+1 AS rnum, n.* "
					+ "FROM notice_board n, (SELECT @row_number:=0) AS dummy "
					+ "ORDER BY notice_board_no DESC) AS subquery " + "WHERE rnum >= ? AND rnum <= ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, startNo);
			pstmt.setInt(2, endNo);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				NoticeBoardDTO dto = new NoticeBoardDTO();

				dto.setNotice_board_no(rs.getInt("notice_board_no"));
				dto.setNotice_board_writer_no(rs.getString("notice_board_writer_no"));
				dto.setNotice_board_writer_id(rs.getString("notice_board_writer_id"));
				dto.setNotice_board_title(rs.getString("notice_board_title"));
				dto.setNotice_board_content(rs.getString("notice_board_content"));
				dto.setNotice_board_file(rs.getString("notice_board_file"));
				dto.setNotice_board_created_date(rs.getString("notice_board_created_date"));
				dto.setNotice_board_updated_date(rs.getString("notice_board_updated_date"));
				dto.setNotice_board_hit(rs.getInt("notice_board_hit"));

				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return list;
	}

	// 모든 영화를 조회하는 메서드
	public List<MovieDTO> getMovieList() {

		List<MovieDTO> list = new ArrayList<MovieDTO>();

		try {

			openConn();

			sql = "select * from movie order by movie_no";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieDTO dto = new MovieDTO();

				dto.setMovie_no(rs.getInt("movie_no"));
				dto.setMovie_title(rs.getString("movie_title"));
				dto.setMovie_genre(rs.getString("movie_genre"));
				dto.setMovie_screen_time(rs.getInt("movie_screen_time"));
				dto.setMovie_director(rs.getString("movie_director"));
				dto.setMovie_actor(rs.getString("movie_actor"));
				dto.setMovie_release_date(rs.getString("movie_release_date"));
				dto.setMovie_poster(rs.getString("movie_poster"));
				dto.setMovie_content(rs.getString("movie_content"));
				dto.setMovie_limit_age(rs.getInt("movie_limit_age"));

				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return list;
	} // getMovieList() end

	// 현재상영작을 조회하는 메서드
	public List<MovieDTO> getNowMovieList() {

		List<MovieDTO> list = new ArrayList<MovieDTO>();

		try {

			openConn();

			sql = "select * from movie where movie_release_date <= now() order by movie_no";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieDTO dto = new MovieDTO();

				dto.setMovie_no(rs.getInt("movie_no"));
				dto.setMovie_title(rs.getString("movie_title"));
				dto.setMovie_genre(rs.getString("movie_genre"));
				dto.setMovie_screen_time(rs.getInt("movie_screen_time"));
				dto.setMovie_director(rs.getString("movie_director"));
				dto.setMovie_actor(rs.getString("movie_actor"));
				dto.setMovie_release_date(rs.getString("movie_release_date"));
				dto.setMovie_poster(rs.getString("movie_poster"));
				dto.setMovie_content(rs.getString("movie_content"));
				dto.setMovie_limit_age(rs.getInt("movie_limit_age"));

				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return list;
	} // getMovieList() end

	// 상영예정작을 조회하는 메서드
	public List<MovieDTO> getPlanMovieList() {

		List<MovieDTO> list = new ArrayList<MovieDTO>();

		try {

			openConn();

			sql = "select * from movie where movie_release_date > now() order by movie_no";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieDTO dto = new MovieDTO();

				dto.setMovie_no(rs.getInt("movie_no"));
				dto.setMovie_title(rs.getString("movie_title"));
				dto.setMovie_genre(rs.getString("movie_genre"));
				dto.setMovie_screen_time(rs.getInt("movie_screen_time"));
				dto.setMovie_director(rs.getString("movie_director"));
				dto.setMovie_actor(rs.getString("movie_actor"));
				dto.setMovie_release_date(rs.getString("movie_release_date"));
				dto.setMovie_poster(rs.getString("movie_poster"));
				dto.setMovie_content(rs.getString("movie_content"));
				dto.setMovie_limit_age(rs.getInt("movie_limit_age"));

				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return list;
	} // getMovieList() end

	// 영화의 상세정보를 조회하는 메서드
	public MovieDTO getMovieSpecific(int no) {

		MovieDTO dto = null;

		try {
			openConn();

			sql = "select * from movie where movie_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new MovieDTO();

				dto.setMovie_no(rs.getInt("movie_no"));
				dto.setMovie_title(rs.getString("movie_title"));
				dto.setMovie_genre(rs.getString("movie_genre"));
				dto.setMovie_screen_time(rs.getInt("movie_screen_time"));
				dto.setMovie_director(rs.getString("movie_director"));
				dto.setMovie_actor(rs.getString("movie_actor"));
				dto.setMovie_release_date(rs.getString("movie_release_date"));
				dto.setMovie_poster(rs.getString("movie_poster"));
				dto.setMovie_content(rs.getString("movie_content"));
				dto.setMovie_limit_age(rs.getInt("movie_limit_age"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return dto;
	} // getMovieSpecific(int no) end

	// 영화 리뷰를 모두 가져오는 메서드 (작성일 기준으로 나열)
	public List<MovieReviewDTO> getFormatTimeMovieReview(int no) {
		List<MovieReviewDTO> list = new ArrayList<MovieReviewDTO>();

		try {
			openConn();

			sql = "select * from movie_review where movie_review_movie_no = ?  order by movie_review_no desc";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieReviewDTO dto = new MovieReviewDTO();

				dto.setMovie_review_no(rs.getInt("movie_review_no"));
				dto.setMovie_review_writer_no(rs.getString("movie_review_writer_no"));
				dto.setMovie_review_writer_id(rs.getString("movie_review_writer_id"));
				dto.setMovie_review_movie_no(rs.getInt("movie_review_movie_no"));
				dto.setMovie_review_movie_title(rs.getString("movie_review_movie_title"));
				dto.setMovie_review_content(rs.getString("movie_review_content"));
				dto.setMovie_review_created_date(rs.getString("movie_review_created_date"));
				dto.setMovie_review_recommend(rs.getInt("movie_review_recommend"));
				dto.setMovie_review_rating(rs.getInt("movie_review_rating"));

				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return list;

	} // getMovieReview(int no) end

	public List<MovieReviewDTO> getFormatRecommendReview(int no) {
		List<MovieReviewDTO> list = new ArrayList<MovieReviewDTO>();

		try {
			openConn();

			sql = "select * from movie_review where movie_review_movie_no = ? order by movie_review_recommend desc";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieReviewDTO dto = new MovieReviewDTO();

				dto.setMovie_review_no(rs.getInt("movie_review_no"));
				dto.setMovie_review_writer_no(rs.getString("movie_review_writer_no"));
				dto.setMovie_review_writer_id(rs.getString("movie_review_writer_id"));
				dto.setMovie_review_movie_no(rs.getInt("movie_review_movie_no"));
				dto.setMovie_review_movie_title(rs.getString("movie_review_movie_title"));
				dto.setMovie_review_content(rs.getString("movie_review_content"));
				dto.setMovie_review_created_date(rs.getString("movie_review_created_date"));
				dto.setMovie_review_recommend(rs.getInt("movie_review_recommend"));
				dto.setMovie_review_rating(rs.getInt("movie_review_rating"));

				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return list;
	}

	// 영화 리뷰 추천 (따봉 이미지) 클릭시 증가 시키는 메서드
	public void recommendUpCount(int no) {

		try {
			openConn();

			sql = "update movie_review set movie_review_recommend = movie_review_recommend + 1 where movie_review_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

	} // public void recommendUpCount(int no) end

	// 영화 등록 메서드
	public int insertMovie(MovieDTO dto) {

		int count = 0;

		try {
			openConn();

			sql = "select count(*) from movie";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1) + 1;
			}

			sql = "insert into movie values(?, ?, ?, ?, ?, ?, ?, ?, null, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, count);
			pstmt.setString(2, dto.getMovie_title());
			pstmt.setString(3, dto.getMovie_genre());
			pstmt.setInt(4, dto.getMovie_screen_time());
			pstmt.setString(5, dto.getMovie_director());
			pstmt.setString(6, dto.getMovie_actor());
			pstmt.setInt(7, dto.getMovie_limit_age());
			pstmt.setString(8, dto.getMovie_release_date());
			pstmt.setString(9, dto.getMovie_content());

			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return count;
	}

	// 영화 포스터 등록 메서드
	public int insertMoviePoster(int movie_no, String FileDBName) {

		int result = 0;

		try {
			openConn();

			sql = "update movie set movie_poster = ? where movie_no = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, FileDBName);
			pstmt.setInt(2, movie_no);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return result;
	}

	// getFaqList()
	public List<InquiryHistoryDTO> getFaqList() {

		List<InquiryHistoryDTO> list = new ArrayList<InquiryHistoryDTO>();

		try {
			openConn();
			sql = "select * from inquiry_history order by inquiry_history_no desc";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				InquiryHistoryDTO dto = new InquiryHistoryDTO();

				dto.setInquiry_history_no(rs.getInt("Inquiry_history_no"));
				dto.setInquiry_history_writer_no(rs.getString("Inquiry_history_writer_no"));
				dto.setInquiry_history_writer_id(rs.getString("Inquiry_history_writer_id"));
				dto.setInquiry_history_type(rs.getString("Inquiry_history_type"));
				dto.setInquiry_history_title("Inquiry_history_title");
				dto.setInquiry_history_content("Inquiry_history_content");
				dto.setInquiry_history_file("Inquiry_history_file");
				dto.setInquiry_history_created_date(rs.getString("Inquiry_history_created_date"));

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return list;
	}

	public int signupIdDuplicateCheck(String id) {

		int result = 0;

		try {
			openConn();

			// member 테이블에서 체크
			sql = "select * from member where member_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 1;
			}

			// admin 테이블에서 체크
			sql = "select * from admin where admin_id = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return result;
	}

	// 관리자 영화 삭제 메서드
	public int adminDeleteMovie(int no) {
		int result = 0;

		try {
			openConn();

			sql = "delete from movie where movie_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}
		return result;
	} // AdminDeleteNowMovie(int no) end

	// 삭제시 중간에 영화들의 번호를 바꿔주는 메서드
	public void deleteMovieNoSequence(int no) {

		try {
			openConn();

			sql = "update movie set " + " movie_no = movie_no - 1 " + " where movie_no > ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

	} // deleteNoSequence() 메서드 end

	// 관리자 영화 수정 메서드
	public int adminUpdateMovie(MovieDTO dto) {

		int result = 0;

		try {
			openConn();

			sql = "update movie set movie_title = ?, movie_genre = ?, movie_screen_time = ?, "
					+ "movie_director = ?, movie_actor = ?, movie_release_date = ?, movie_content = ?, "
					+ "movie_limit_age = ? where movie_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getMovie_title());
			pstmt.setString(2, dto.getMovie_genre());
			pstmt.setInt(3, dto.getMovie_screen_time());
			pstmt.setString(4, dto.getMovie_director());
			pstmt.setString(5, dto.getMovie_actor());
			pstmt.setString(6, dto.getMovie_release_date());
			pstmt.setString(7, dto.getMovie_content());
			pstmt.setInt(8, dto.getMovie_limit_age());
			pstmt.setInt(9, dto.getMovie_no());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}
		return result;
	} // adminUpdateMovie()end

	// 관리자 공지 사항 추가 메서드
	public int adminInsertNoticeBoard(NoticeBoardDTO dto) {

		int result = 0, count = 0;

		try {
			openConn();

			sql = "select max(notice_board_no) from notice_board";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1) + 1;
			}

			sql = "insert into notice_board values(?,?,?,?,?,null,now(),null,default)";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, count);
			pstmt.setString(2, dto.getNotice_board_writer_no());
			pstmt.setString(3, dto.getNotice_board_writer_id());
			pstmt.setString(4, dto.getNotice_board_title());
			pstmt.setString(5, dto.getNotice_board_content());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return result;
	} // public int adminInsertNoticeBoard(NoticeBoardDTO dto) end

	// 관리자 공지 사항 삭제 메서드

	public int adminDeleteNotice(int no) {

		int result = 0;

		try {
			openConn();

			sql = "delete from notice_board where notice_board_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}
		return result;
	} // adminDeleteNotice(int no) end

	// 관리자 공지 사항 삭제시 글 번호 변경 메서드
	public void deleteNoticeNoSequence(int no) {

		try {
			openConn();

			sql = "update notice_board set " + " notice_board_no = notice_board_no - 1 " + " where notice_board_no > ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

	} // deleteNoSequence() 메서드 end

	// 관리자 공지사항 수정을 위해 내부내용을 가져오는 매서드
	public NoticeBoardDTO getNoticeContent(int no) {

		NoticeBoardDTO dto = null;

		try {
			openConn();

			sql = "select * from notice_board where notice_board_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new NoticeBoardDTO();

				dto.setNotice_board_no(rs.getInt("notice_board_no"));
				dto.setNotice_board_writer_no(rs.getString("notice_board_writer_no"));
				dto.setNotice_board_writer_id(rs.getString("notice_board_writer_id"));
				dto.setNotice_board_title(rs.getString("notice_board_title"));
				dto.setNotice_board_content(rs.getString("notice_board_content"));
				dto.setNotice_board_file(rs.getString("notice_board_file"));
				dto.setNotice_board_created_date(rs.getString("notice_board_created_date"));
				dto.setNotice_board_updated_date(rs.getString("notice_board_updated_date"));
				dto.setNotice_board_hit(rs.getInt("notice_board_hit"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return dto;
	} // getNoticeContent() end

	// 공지사항을 수정하는 관리자 메서드
	public int updateNotice(NoticeBoardDTO dto) {
		int result = 0;

		try {
			openConn();

			sql = "update notice_board set notice_board_title = ?, notice_board_content = ?, "
					+ " notice_board_updated_date = now() where notice_board_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getNotice_board_title());
			pstmt.setString(2, dto.getNotice_board_content());
			pstmt.setInt(3, dto.getNotice_board_no());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}
		return result;
	} // updateNotice(NoticeBoardDTO dto) end

	// 공지사항 페이징 처리 메서드
	public int getNoticeCount() {
		int count = 0;

		try {
			openConn();

			sql = "select count(*) from notice_board";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				count = rs.getInt(1);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return count;
	} // getNoticeCount() 메서드 end

	public int getNoticeCount(String field, String keyword) {

		int count = 0;

		try {
			openConn();

			sql = "select count(*) from notice_board ";

			if (field.equals("search_title")) {
				sql += " where notice_board_title like ?";
			} else if (field.equals("search_cont")) {
				sql += " where notice_board_content like ?";
			} else if (field.equals("search_title_cont")) {
				sql += " where notice_board_title like ?" + " or notice_board_content like ?";
			} else {
				sql += " where notice_board_writer_no like ?";
			}

			pstmt = con.prepareStatement(sql);

			if (field.equals("search_title_cont")) {
				pstmt.setString(1, "%" + keyword + "%");
				pstmt.setString(2, "%" + keyword + "%");
			} else {
				pstmt.setString(1, "%" + keyword + "%");
			}

			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return count;

	} // getNoticeCount() end

	// 유저가 영화번호를 가지고 리뷰를 작성할 메서드
	public int memberInsertReview(MovieReviewDTO dto) {

		int result = 0, count = 0;

		try {
			openConn();

			sql = "select max(movie_review_no) from movie_review";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1) + 1;
			}

			sql = "insert into movie_review values(?,?,?,?,?,?,now(),default,default)";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, count);
			pstmt.setString(2, dto.getMovie_review_writer_no());
			pstmt.setString(3, dto.getMovie_review_writer_id());
			pstmt.setInt(4, dto.getMovie_review_movie_no());
			pstmt.setString(5, dto.getMovie_review_movie_title());
			pstmt.setString(6, dto.getMovie_review_content());
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return result;
	} // memberInsertReview end
		// 공지 조회수 증가 메서드

	// 공지 조회수 증가 메서드
	public void noticeCount(int no) {

		try {

			openConn();

			sql = "update notice_board set notice_board_hit = notice_board_hit + 1 where notice_board_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConn(pstmt, con);

	} // noticeCount end

	public int updateMember(MemberDTO dto) {
		int result = 0;

		try {

			openConn();
			sql = "update member set member_name = ?, " + "member_email = ? ," + "member_phone = ? "
					+ "where member_id=? ";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getMember_name());
			pstmt.setString(2, dto.getMember_email());
			pstmt.setString(3, dto.getMember_phone());
			pstmt.setString(4, dto.getMember_id());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

		return result;
	} // updateMember end

	public int updatePwd(MemberDTO dto) {
		int result = 0;

		try {
			openConn();

			sql = "update member set member_pwd=? where member_no=?";
			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getMember_pwd());
			pstmt.setString(2, dto.getMember_no());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

		return result;

	} // updatePwd end

	public int deleteMember(String no) {
		int result = 0;

		try {
			openConn();

			sql = "delete from member where member_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

		return result;
	} // deleteMember end

	public List<TicketingHistoryDTO> getTicketingHistory(String no) {

		List<TicketingHistoryDTO> list = new ArrayList<TicketingHistoryDTO>();

		try {
			openConn();
			sql = "select * from ticketing_history where ticketing_history_member_no = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				TicketingHistoryDTO dto = new TicketingHistoryDTO();

				dto.setTicketing_history_no(rs.getInt("ticketing_history_no"));
				dto.setTicketing_history_member_no(rs.getString("ticketing_history_member_no"));
				dto.setTicketing_history_movie_no(rs.getInt("ticketing_history_movie_no"));
				dto.setTicketing_history_movie_title(rs.getString("ticketing_history_movie_title"));
				dto.setTicketing_history_movie_start_date(rs.getString("ticketing_history_movie_start_date"));
				dto.setTicketing_history_movie_start_time(rs.getString("ticketing_history_movie_start_time"));
				dto.setTicketing_history_region(rs.getString("ticketing_history_region"));
				dto.setTicketing_history_location(rs.getString("ticketing_history_location"));
				dto.setTicketing_history_seat(rs.getString("ticketing_history_seat"));
				dto.setTicketing_history_payment_amount(rs.getInt("ticketing_history_payment_amount"));
				dto.setTicketing_history_payment_method(rs.getString("ticketing_history_payment_method"));
				dto.setTicketing_history_booking_count(rs.getInt("ticketing_history_booking_count"));
				dto.setTicketing_history_booking_date(rs.getString("ticketing_history_booking_date"));

				list.add(dto);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConn(rs, pstmt, con);

		return list;

	} // getTicketingHistory end

	public List<MovieDTO> getMovieInfo(int no) {
		List<MovieDTO> list = new ArrayList<MovieDTO>();

		try {
			openConn();

			sql = "select * from movie where movie_title = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				MovieDTO dto = new MovieDTO();

				dto.setMovie_no(rs.getInt("movie_no"));
				dto.setMovie_title(rs.getString("movie_title"));
				dto.setMovie_genre(rs.getString("movie_genre"));
				dto.setMovie_screen_time(rs.getInt("movie_screen_time"));
				dto.setMovie_director(rs.getString("movie_director"));
				dto.setMovie_actor(rs.getString("movie_actor"));
				dto.setMovie_release_date(rs.getString("movie_release_date"));
				dto.setMovie_poster(rs.getString("movie_poster"));
				dto.setMovie_content(rs.getString("movie_content"));
				dto.setMovie_limit_age(rs.getInt("Movie_limit_age"));

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);

		}

		return list;
	} // getMovieInfo end

	public List<ScreeningDTO> getScreening(int no) {
		List<ScreeningDTO> list = new ArrayList<ScreeningDTO>();

		try {

			openConn();
			sql = "select * from screening where screening_movie_title = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				ScreeningDTO dto = new ScreeningDTO();

				dto.setScreening_no(rs.getInt("screening_no"));
				dto.setScreening_region(rs.getString("screening_region"));
				dto.setScreening_location(rs.getString("Screening_location"));
				dto.setScreening_movie_no(rs.getInt("screening_movie_no"));
				dto.setScreening_movie_title(rs.getString("screening_movie_title"));
				dto.setScreening_movie_start_date(rs.getString("screening_movie_start_date"));
				dto.setScreening_movie_start_time(rs.getString("screening_movie_start_time"));
				dto.setScreening_hall(rs.getInt("screening_hall"));
				dto.setScreening_seat_status(rs.getBoolean("screening_seat_status"));

				list.add(dto);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return list;

	} // getScreening;

	// insertInquiry(InquiryHistoryDTO dto) 문의 사항 입력
	public int insertInquiry(InquiryHistoryDTO dto) {

		int result = 0, count = 0;

		try {
			openConn();
			sql = "select max(inquiry_history_no) from inquiry_history";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1) + 1;
			}

			sql = "insert into inquiry_history values(?,?,?,?,?,?,?,?,?,?,?,now())";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, count);
			pstmt.setString(2, dto.getInquiry_history_writer_no());
			pstmt.setString(3, dto.getInquiry_history_writer_id());
			pstmt.setString(4, dto.getInquiry_history_type_etc());
			pstmt.setString(5, dto.getInquiry_history_type());
			pstmt.setString(6, dto.getInquiry_history_title());
			pstmt.setString(7, dto.getInquiry_history_content());
			pstmt.setString(8, dto.getInquiry_history_file());
			pstmt.setString(9, dto.getInquiry_history_customer_name());
			pstmt.setString(10, dto.getInquiry_history_phone());
			pstmt.setString(11, dto.getInquiry_history_email());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return result;

	}// insertInquiry(InquiryHistoryDTO dto) end

	// getInquiryList() 1:1문의 리스트
	public List<InquiryHistoryDTO> getInquiryList() {

		List<InquiryHistoryDTO> list = new ArrayList<InquiryHistoryDTO>();

		try {
			openConn();
			sql = "select * from inquiry_history order by inquiry_history_no desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				InquiryHistoryDTO dto = new InquiryHistoryDTO();

				dto.setInquiry_history_no(rs.getInt("Inquiry_history_no"));
				dto.setInquiry_history_writer_no(rs.getString("Inquiry_history_writer_no"));
				dto.setInquiry_history_writer_id(rs.getString("Inquiry_history_writer_id"));
				dto.setInquiry_history_type_etc(rs.getString("Inquiry_history_type_etc"));
				dto.setInquiry_history_type(rs.getString("Inquiry_history_type"));
				dto.setInquiry_history_title(rs.getString("inquiry_history_title"));
				dto.setInquiry_history_content(rs.getString("inquiry_history_content"));
				dto.setInquiry_history_file(rs.getString("inquiry_history_file"));
				dto.setInquiry_history_customer_name(rs.getString("Inquiry_history_customer_name"));
				dto.setInquiry_history_phone(rs.getString("Inquiry_history_phone"));
				dto.setInquiry_history_email(rs.getString("Inquiry_history_email"));
				dto.setInquiry_history_created_date(rs.getString("Inquiry_history_created_date"));

				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return list;
	}// getInquiryList() 1:1문의 리스트 end

	// getInquiryModify(int no)1:1문의 상제 정보
	public InquiryHistoryDTO getInquiryContent(int no) {

		InquiryHistoryDTO dto = null;

		try {
			openConn();

			sql = "select * from inquiry_history where inquiry_history_no = ?";
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new InquiryHistoryDTO();

				dto.setInquiry_history_no(rs.getInt("Inquiry_history_no"));
				dto.setInquiry_history_writer_no(rs.getString("Inquiry_history_writer_no"));
				dto.setInquiry_history_writer_id(rs.getString("Inquiry_history_writer_id"));
				dto.setInquiry_history_type_etc(rs.getString("Inquiry_history_type_etc"));
				dto.setInquiry_history_type(rs.getString("Inquiry_history_type"));
				dto.setInquiry_history_title(rs.getString("inquiry_history_title"));
				dto.setInquiry_history_content(rs.getString("inquiry_history_content"));
				dto.setInquiry_history_file(rs.getString("inquiry_history_file"));
				dto.setInquiry_history_customer_name(rs.getString("Inquiry_history_customer_name"));
				dto.setInquiry_history_phone(rs.getString("Inquiry_history_phone"));
				dto.setInquiry_history_email(rs.getString("Inquiry_history_email"));
				dto.setInquiry_history_created_date(rs.getString("Inquiry_history_created_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return dto;

	}// getInquiryModify(int no)1:1문의 상제 정보 end

	// deleteCategory(history_no) 문의사항 삭제
	public int deleteInquiry(int history_no) {

		int result = 0;

		try {
			openConn();

			sql = "delete from inquiry_history " + " where inquiry_history_no = ? ";
			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, history_no);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

		return result;
	}// deleteCategory(history_no) 문의사항 삭제 end

	// updateSequence(int history_no) 문의사항 글 번호 작업
	public void updateSequence(int history_no) {

		try {
			openConn();
			sql = "update inquiry_history set " + " inquiry_history_no = inquiry_history_no - 1 "
					+ " where inquiry_history_no > ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, history_no);

			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

	}// updateSequence(int history_no) 문의사항 글 번호 작업 end

	public List<Integer> getMovieScreenTime(String no) {

		List<Integer> list = new ArrayList<Integer>();

		try {

			openConn();

			sql = "select m.movie_screen_time " + "from ticketing_history as t "
					+ "join movie as m on t.ticketing_history_movie_no = m.movie_no "
					+ "where t.ticketing_history_member_no = ? "
					+ "order by t.ticketing_history_movie_start_date asc, t.ticketing_history_movie_start_time asc";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				list.add(rs.getInt(1));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return list;

	} // getMovieScreenTime end

	// 관리자 영화 검색 조회를 위한 메서드 상단의 getMovieList의 오버로딩
	public List<MovieDTO> getMovieList(String field, String keyword) {

		List<MovieDTO> movieSearchList = new ArrayList<>();

		try {
			openConn();

			sql = "select * from movie ";
			if (field.equals("movie_title")) {
				sql += " where movie_title like ? ";
			} else if (field.equals("genre")) {
				sql += " where movie_genre like ? ";
			} else if (field.equals("actor")) {
				sql += " where movie_actor like ? ";
			} else {
				sql += " where movie_director like ?";
			}

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, "%" + keyword + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MovieDTO dto = new MovieDTO();

				dto.setMovie_no(rs.getInt("movie_no"));
				dto.setMovie_title(rs.getString("movie_title"));
				dto.setMovie_genre(rs.getString("movie_genre"));
				dto.setMovie_screen_time(rs.getInt("movie_screen_time"));
				dto.setMovie_director(rs.getString("movie_director"));
				dto.setMovie_actor(rs.getString("movie_actor"));
				dto.setMovie_release_date(rs.getString("movie_release_date"));
				dto.setMovie_poster(rs.getString("movie_poster"));
				dto.setMovie_content(rs.getString("movie_content"));
				dto.setMovie_limit_age(rs.getInt("movie_limit_age"));

				movieSearchList.add(dto);
			}
			System.out.println("12341412assadasdd");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return movieSearchList;
	} // getMovieList(String field,String keyword) end

	// 멤버검색을 위한 메서드
	public List<MemberDTO> getMemberList(String field, String keyword) {

		List<MemberDTO> memberSearchList = new ArrayList<>();

		try {
			openConn();

			sql = "select * from member ";
			if (field.equals("member_name")) {
				sql += " where member_name like ? ";
			} else {
				sql += " where member_id like ?";
			}

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, "%" + keyword + "%");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberDTO dto = new MemberDTO();

				dto.setMember_no(rs.getString("member_no"));
				dto.setMember_id(rs.getString("member_id"));
				dto.setMember_pwd(rs.getString("member_pwd"));
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_phone(rs.getString("member_phone"));
				dto.setMember_email(rs.getString("member_email"));
				dto.setMember_mileage(rs.getInt("member_mileage"));
				dto.setMember_grade(rs.getString("member_grade"));
				dto.setMember_signup_date(rs.getString("member_signup_date"));
				memberSearchList.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return memberSearchList;
	} // getMemberList(String field,String keyword) end

	// 멤버 시간차순정렬 페이징을 위한 메이드
	public List<MemberDTO> getMemberDateList(int pageMd, int rowsizeMd) {
		List<MemberDTO> list = new ArrayList<MemberDTO>();

		// 해당 페이지에서 시작 번호
		int startNo = (pageMd * rowsizeMd) - (rowsizeMd - 1);

		// 해당 페이지에서 끝 번호
		int endNo = (pageMd * rowsizeMd);

		try {
			openConn();

			sql = "SELECT * FROM (SELECT @row_number:=@row_number+1 AS rnum, m.* "
					+ "FROM member m, (SELECT @row_number:=0) AS dummy "
					+ "ORDER BY member_signup_date DESC) AS subquery " + "WHERE rnum >= ? AND rnum <= ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, startNo);
			pstmt.setInt(2, endNo);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberDTO dto = new MemberDTO();

				dto.setMember_no(rs.getString("member_no"));
				dto.setMember_id(rs.getString("member_id"));
				dto.setMember_pwd(rs.getString("member_pwd"));
				dto.setMember_name(rs.getString("member_name"));
				dto.setMember_phone(rs.getString("member_phone"));
				dto.setMember_email(rs.getString("member_email"));
				dto.setMember_mileage(rs.getInt("member_mileage"));
				dto.setMember_grade(rs.getString("member_grade"));
				dto.setMember_signup_date(rs.getString("member_signup_date"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return list;
	} // getMemberList() 오버로딩 end

	public int getMemberDateCount() {
		int count = 0;

		try {
			openConn();

			sql = "select count(*) from member";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				count = rs.getInt(1);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}

		return count;
	} // getMemberDateCount 메서드 end

	public int adminDeleteReview(int no) {
		int result = 0;

		try {
			openConn();

			sql = "delete from movie_review where movie_review_no = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}
		return result;
	} // adminDeleteReview(int no) end

	// 리뷰를 삭제할때 리뷰번호정렬을 위한 매서드
	public void deleteReviewNoSequence(int no) {

		try {
			openConn();

			sql = "update movie_review set " + " movie_review_no = movie_review_no - 1 " + " where movie_review_no > ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, no);

			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}
	} // deleteReviewNoSequence(int no) end

	// 매출을 위한 메서드
	public List<TicketingHistoryDTO> getTicketSalesListByMonth(int monthNo) {
		List<TicketingHistoryDTO> list = new ArrayList<TicketingHistoryDTO>();

		try {
			openConn();

			sql = "SELECT ticketing_history_payment_amount, ticketing_history_booking_count "
					+ "FROM ticketing_history WHERE MONTH(ticketing_history_booking_date) = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, monthNo);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				TicketingHistoryDTO dto = new TicketingHistoryDTO();

				dto.setTicketing_history_payment_amount(rs.getInt("ticketing_history_payment_amount"));
				dto.setTicketing_history_booking_count(rs.getInt("ticketing_history_booking_count"));
				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return list;
	}

	public int insertTicketingHistory(TicketingHistoryDTO tDto) {

		int result = 0, count = 0;

		try {
			openConn();

			sql = "select count(*) from ticketing_history";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				count = rs.getInt(1) + 1;
			}

			sql = "insert into ticketing_history values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, default)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, count);
			pstmt.setString(2, tDto.getTicketing_history_member_no());
			pstmt.setInt(3, tDto.getTicketing_history_movie_no());
			pstmt.setString(4, tDto.getTicketing_history_movie_title());
			pstmt.setString(5, tDto.getTicketing_history_movie_start_date());
			pstmt.setString(6, tDto.getTicketing_history_movie_start_time());
			pstmt.setString(7, tDto.getTicketing_history_region());
			pstmt.setString(8, tDto.getTicketing_history_location());
			pstmt.setString(9, tDto.getTicketing_history_seat());
			pstmt.setInt(10, tDto.getTicketing_history_payment_amount());
			pstmt.setString(11, tDto.getTicketing_history_payment_method());
			pstmt.setInt(12, tDto.getTicketing_history_booking_count());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

		return result;
	}

	public int ticketdelete(String no) {
		int result = 0;

		try {
			openConn();
			sql = "delete from ticketing_history where ticketing_history_no = ? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

		return result;
	} // ticketdelete end

	public int updateMemberByAdmin(MemberDTO dto) {

		int result = 0;
		try {
			openConn();
			sql = "update member set member_pwd = ?, member_phone = ?, member_email = ?, member_mileage = ? where member_id = ?";

			pstmt = con.prepareStatement(sql);

			pstmt.setString(1, dto.getMember_pwd());
			pstmt.setString(2, dto.getMember_phone());
			pstmt.setString(3, dto.getMember_email());
			pstmt.setInt(4, dto.getMember_mileage());
			pstmt.setString(5, dto.getMember_id());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}
		return result;

	}// updateMemberByAdmin(MemberDTO dto) end

	public int adminDeleteMember(String no) {
		int result = 0;

		try {
			openConn();

			sql = "delete from member where member_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConn(pstmt, con);
		}

		return result;
	} // deleteMember end
		// getNoticeBoardList() 공지사항 검색결과를 보여주기 위한 메서드로 오버로딩 사용

	public List<NoticeBoardDTO> getNoticeBoardList(String field, String keyword, int page, int rowsize) {

		List<NoticeBoardDTO> searchList = new ArrayList<>();

		// 해당 페이지에서 시작 번호
		int startNo = (page * rowsize) - (rowsize - 1);

		// 해당 페이지에서 끝 번호
		int endNo = (page * rowsize);

		try {

			openConn();

			sql = "select * from (select row_number() " + " over(order by notice_board_no desc) as rnum, "
					+ " n.* from notice_board n ";
			if (field.equals("search_title")) {
				sql += " where notice_board_title like ?) AS subquery";
			} else if (field.equals("search_cont")) {
				sql += " where notice_board_content like ?) AS subquery";
			} else if (field.equals("search_title_cont")) {
				sql += " where notice_board_title like ? " + " or notice_board_content like ?) AS subquery";
			} else {
				sql += " where notice_board_writer_no ?) AS subquery";
			}

			sql += " where rnum >= ? and rnum <= ?";

			pstmt = con.prepareStatement(sql);

			if (field.equals("search_title_cont")) {
				pstmt.setString(1, "%" + keyword + "%");
				pstmt.setString(2, "%" + keyword + "%");
				pstmt.setInt(3, startNo);
				pstmt.setInt(4, endNo);
			} else {
				pstmt.setString(1, "%" + keyword + "%");
				pstmt.setInt(2, startNo);
				pstmt.setInt(3, endNo);
			}

			rs = pstmt.executeQuery();

			while (rs.next()) {
				NoticeBoardDTO dto = new NoticeBoardDTO();

				dto.setNotice_board_no(rs.getInt("notice_board_no"));
				dto.setNotice_board_writer_no(rs.getString("notice_board_writer_no"));
				dto.setNotice_board_writer_id(rs.getString("notice_board_writer_id"));
				dto.setNotice_board_title(rs.getString("notice_board_title"));
				dto.setNotice_board_content(rs.getString("notice_board_content"));
				dto.setNotice_board_file(rs.getString("notice_board_file"));
				dto.setNotice_board_created_date(rs.getString("notice_board_created_date"));
				dto.setNotice_board_updated_date(rs.getString("notice_board_updated_date"));
				dto.setNotice_board_hit(rs.getInt("notice_board_hit"));

				searchList.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		return searchList;
	} // getNoticeBoardList(String field,String keyword,int page,int rowsize) end

}
