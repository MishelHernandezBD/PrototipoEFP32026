//Britany Mishel Hernandez Davila 9959-24-4178

package Modelo.Carreras;

import Controlador.Carreras.clsCarreras;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mishel
 */
public class CarrerasDAO {
    // Consultas SQL
    private static final String SQL_SELECT = "SELECT codigo_carrera, nombre_carrera, codigo_facultad, estatus_carrera FROM carreras";
    private static final String SQL_INSERT ="INSERT INTO carreras(nombre_carrera, codigo_facultad,estatus_carrera) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE ="UPDATE carreras SET nombre_carrera=?, codigo_facultad=?, estatus_carrera=?  WHERE codigo_carrera=?";
    private static final String SQL_DELETE ="DELETE FROM carreras WHERE codigo_carrera=?";
    private static final String SQL_QUERY ="SELECT nombre_carrera, codigo_facultad, estatus_carrera FROM carreras WHERE codigo_carrera=?";

    // LISTAR
    public List<clsCarreras> select() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        clsCarreras carrera = null;
        List<clsCarreras> lista = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString("codigo_carrera");
                String nombre = rs.getString("nombre_carrera");
                String codigoF = rs.getString("codigo_facultad");
                String estatus = rs.getString("estatus_carrera");

                carrera = new clsCarreras();

                carrera.setCodigoCarrera(id);
                carrera.setNombreCarrera(nombre);
                carrera.setCodigoFacultad(codigoF);
                carrera.setEstatusCarrera(estatus);

                lista.add(carrera);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return lista;
    }

    
     // INSERTAR
    public int insert(clsCarreras carreras) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, carreras.getNombreCarrera());
            stmt.setString(2, carreras.getCodigoFacultad());
            stmt.setString(3, carreras.getEstatusCarrera());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }
       
    // MODIFICAR
    public int update(clsCarreras carreras) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, carreras.getNombreCarrera());
            stmt.setString(2, carreras.getCodigoFacultad());
            stmt.setString(3, carreras.getEstatusCarrera());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }

    // ELIMINAR
    public int delete(clsCarreras carreras) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setString(1, carreras.getCodigoCarrera());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }
    
    // BUSCAR POR ID
    public clsCarreras query(clsCarreras carreras) {
        //Definicion de variables
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clsCarreras> lista = new ArrayList<clsCarreras>(); //Lista de datos
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, carreras.getCodigoCarrera());
            rs = stmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString("codigo_carrera");
                String nombre = rs.getString("nombre_carrera");
                String codigoF = rs.getString("codigo_facultad");
                String estatus = rs.getString("estatus_carrera");

                carreras = new clsCarreras();

                carreras.setCodigoCarrera(id);
                carreras.setNombreCarrera(nombre);
                carreras.setCodigoFacultad(codigoF);
                carreras.setEstatusCarrera(estatus);

                lista.add(carreras);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return carreras;
    }
    
}
