package com.example.demo.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

    private static DeptDAO instance = null;

    public static DeptDAO getInstance() {
        if (instance == null) {
            instance = new DeptDAO();
        }
        return instance;
    } //싱글톤 객체 생성 end

    public void openConn(){
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/psm";
        String user = "root";
        String pwd = "1234";

        try {
            Class.forName(driver);

            con = DriverManager.getConnection(url, user, pwd);
        }catch(Exception e) {
            e.printStackTrace();
        }
    } //openConn end

    public void closeConn(Connection con, PreparedStatement ps, ResultSet rs){

        try {
            if(con != null)
                con.close();
            if(ps != null)
                ps.close();
            if(rs != null)
                rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void closeConn(Connection con, PreparedStatement ps){

        try {
            if(con != null)
                con.close();
            if(ps != null)
                ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    } //closeConn end

    //DAO 코딩 구역

    public List<DeptDTO> selectList() {
        List<DeptDTO> list = new ArrayList<>();

        openConn();

        try {
            sql = "select * from dept";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                DeptDTO dto = new DeptDTO();
                for (DeptDTO i : list) {
                    dto.setDeptno(i.getDeptno());
                    dto.setDname(i.getDname());
                    dto.setLoc(i.getLoc());

                    list.add(dto);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConn(con, ps, rs);
        }

        return list;
    }



}
