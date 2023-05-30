package conectarsql;
import java.sql.*;

public class ConectarSQL {


    public static  Connection getConexion() {

        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=Animes;user=sa;password=123456");

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        return con;

    }

  //Metodo para comprobar la conexion

    public static void main(String[] args){
       System.out.println(ConectarSQL.getConexion());
   }
 


    public static void cerrar(Connection con){

        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }


    public static void cerrar(PreparedStatement ps){

        try {
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }


     public static void cerrar(ResultSet rs){

        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
