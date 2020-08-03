
import ws.Exception_Exception;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class probandoWebService {
    public static void main(String[] args) throws Exception{
        /*Scanner in = new Scanner(System.in);
        System.out.print("Que año desea buscar");
        probandoWebService prob = new probandoWebService();
        String año = in.nextLine();
        System.out.println("-----------------------------------------");
        for (int i = 0; i < prob.getEgresados(año).size(); i++) {
            System.out.println("El codigo estudiantil es: "+prob.getEgresados(año).get(i).getOAlumnoCodigo());
            System.out.println("El nombre del estudiante es: "+prob.getEgresados(año).get(i).getOAlumnoNombres());
            System.out.println("El ap Paterno del estudiante es: "+prob.getEgresados(año).get(i).getOAlumnoApellidoPaterno());
            System.out.println("El ap Materno del estudiante es: "+prob.getEgresados(año).get(i).getOAlumnoApellidoMaterno());
            System.out.println("El direccion del estudiante es: "+prob.getEgresados(año).get(i).getOAlumnoDireccion());
            System.out.println("-----------------------------------------");
        }
        System.out.println("numeros de egresados del año"+ año +" es: " +prob.getEgresados(año).size());*/
        PanelEgresados panel = new PanelEgresados();
        panel.setVisible(true);

    }

    static java.util.List<ws.Alumno> getEgresados(java.lang.String name) throws Exception_Exception {
        ws.WS_Service service = new ws.WS_Service();
        ws.WS port = service.getWSPort();
        return port.getEgresados(name);
    }

   
    
}
