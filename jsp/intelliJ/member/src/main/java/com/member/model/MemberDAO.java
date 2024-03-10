package com.member.model;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.lang.reflect.Member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    public static final MemberDAO instance = new MemberDAO();

    public static MemberDAO getInstance(){
        return instance;
    }

    private MemberDAO(){
    }

    public void openConn(){

/*        try {
            Context initCtx = new InitialContext();
            Context ctx = (Context) initCtx.lookup("java:comp/env");
            DataSource ds = (DataSource) ctx.lookup("jdbc/mysql");
            con = ds.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 로드하는데 문제 발생" + e.getMessage());
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psm", "root", "1234");
            System.out.println("DB 연결 완료!");
        } catch (SQLException e) {
            System.out.println("DB 연결 오류" + e.getMessage());
            e.printStackTrace();
        }

    } // openConn() end

    public void closeConn(ResultSet rs, PreparedStatement ps, Connection con){
        try{
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (rs != null) {
                rs.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    } // closeConn(3) end

    public void closeConn(PreparedStatement ps, Connection con){
        try{
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    } // closeConn(2) end


    public List<MemberDTO> getMemberList() {

        List<MemberDTO> list = new ArrayList<>();

        try {
            openConn();

            sql = "select * from member order by num";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                MemberDTO dto = new MemberDTO();

                dto.setNum(rs.getInt("num"));
                dto.setId(rs.getString("id"));
                dto.setName(rs.getString("name"));
                dto.setPwd(rs.getString("pwd"));
                dto.setAge(rs.getInt("age"));
                dto.setMileage(rs.getInt("mileage"));
                dto.setJob(rs.getString("job"));
                dto.setAddr(rs.getString("addr"));
                dto.setRegdate(rs.getString("regdate"));

                list.add(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            closeConn(rs, ps, con);
        }

        return list;
    } // getMemberLisT() end
} // class end
