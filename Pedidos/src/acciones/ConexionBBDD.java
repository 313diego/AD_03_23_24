/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ConexionBBDD {
    Connection con = null;
    Statement st = null;
    
    public ConexionBBDD() { 
        try {
            String ruta = "C:\\Users\\diego\\Desktop\\Pedidos\\src\\pedidos.accdb";
            String url = "jdbc:ucanaccess://"+ruta;
            con = DriverManager.getConnection(url);
            st = con.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Conexion fallida " + ex);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public void Deconexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Conexion fallida " + ex);
        }
    }
}
