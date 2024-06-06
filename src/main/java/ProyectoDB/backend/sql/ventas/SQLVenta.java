/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoDB.backend.sql.ventas;

import ProyectoDB.backend.objetos.venta.Venta;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ProyectoDB.backend.objetos.venta.VentaInterface;
import java.sql.Types;

/**
 *
 * @author jft314
 */
public class SQLVenta implements Operable<Venta, String>, VentaInterface {

    private final Connection connection;

    public SQLVenta(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Venta alta(Venta venta) {
        String sql = String.format("call insertar_venta(%s)", venta);

        System.out.println(sql);
        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.execute();
            return venta;
        } catch (SQLException ex) {
            Logger.getLogger(SQLVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String baja(String id) {
        String sql = String.format("{? = call eliminar_venta('%s')}", id);
        System.out.println(sql);
        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.registerOutParameter(1, Types.VARCHAR);
            callableStatement.execute();

            return callableStatement.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(SQLVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Venta modifica(String id) {
//        String sql = String.format("{call *** P E N D I E N T E *** (%s)}", id);
//
//        try {
//            CallableStatement callableStatement = connection.prepareCall(sql);
//            callableStatement.execute();
//            return null;
//        } catch (SQLException ex) {
//            Logger.getLogger(SQLVenta.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return null;
    }

    @Override
    public Venta consulta(String id) {
        String sql = String.format("{call consultar_venta(%s)}", id);

        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            callableStatement.execute();

            return new Venta(
                    callableStatement.getString(1),
                    callableStatement.getInt(2),
                    callableStatement.getDouble(3),
                    callableStatement.getBoolean(4),
                    callableStatement.getString(5),
                    callableStatement.getString(6),
                    callableStatement.getLong(7));
        } catch (SQLException ex) {
            Logger.getLogger(SQLVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Venta> reporte() {
        String sql = "select * from reporte_venta()";
        List<Venta> ventas = null;

        try {
            CallableStatement callableStatement = connection.prepareCall(sql);
            ResultSet resultSet = callableStatement.executeQuery();

            ventas = new ArrayList<>();

            while (resultSet.next()) {
                ventas.add(new Venta(
                        resultSet.getString(1),
                        resultSet.getInt(2),
                        resultSet.getDouble(3),
                        resultSet.getBoolean(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getLong(7)));
            }

            return ventas;
        } catch (SQLException ex) {
            Logger.getLogger(SQLVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ventas;
    }

}
