
package sobreescriturametodos2;

/**
 *
 * @author Julio Jiménez
 */

import java.util.Calendar;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


class Vehiculo{
    private String nombrePropietario;
    private int cedulaPropietario;
    private int edadPropietario;
    private String direccionPropietario;
    private int telefono;
    private String marca;
    private String tecnologia;
    private int modelo;
    public Vehiculo(){
        nombrePropietario="";
        cedulaPropietario=0;
        edadPropietario=0;
        direccionPropietario="";
        telefono=0;
        marca="";
        tecnologia="";
        modelo=0;
    }
    public Vehiculo(String nombrePropietario,
            int cedulaPropietario,int edadPropietario,
            String direccionPropietario,int telefono,
            String marca, String tecnologia, int modelo){
        this.nombrePropietario=nombrePropietario;
        this.cedulaPropietario=cedulaPropietario;
        this.edadPropietario=edadPropietario;
        this.direccionPropietario=direccionPropietario;
        this.telefono=telefono;
        this.marca=marca;
        this.tecnologia=tecnologia;
        this.modelo=modelo;
    }
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    public int getCedulaPropietario(){
        return cedulaPropietario;
    }
    public int getEdadPropietario(){
        return edadPropietario;
    }
    public String getDireccionPropietario(){
        return direccionPropietario;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getMarca(){
        return marca;
    }
    public String getTecnologia(){
        return tecnologia;
    }
    public int getModelo(){
        return modelo;
    }
}
class Automovil extends Vehiculo{
    private String matriculaAutomovil;
    public Automovil(){
        super();
        matriculaAutomovil="Desconocido";
    }
    public Automovil(String nombrePropietario,int cedulaPropietario,
            int edadPropietario,String direccionPropietario,
            int telefono, String marca, String tecnologia,
            int modelo){

            super(nombrePropietario,cedulaPropietario,edadPropietario,
                direccionPropietario,telefono,marca,tecnologia,modelo);
        matriculaAutomovil="Desconocido";
    }
    public void setMatriculaAutomovil(String matriculaAutomovil){
        this.matriculaAutomovil=matriculaAutomovil;
    }
    public String getMatriculaAutomovil(){
        return matriculaAutomovil;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"Datos del Automovil:\nMarca del Vehículo: "+
                getMarca()+"\n "+getTecnologia()+
                "MATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil());
    }
    public void mostrarDatos1(){
        JOptionPane.showMessageDialog(null,"Datos del Propietario:"
                + "\nNombre del Propietario: "+
                getNombrePropietario()+"\nNúmero de cédula:"+getCedulaPropietario()+
                "\nEdad: "+getEdadPropietario()+" años"+"\nDirección: "
                +getDireccionPropietario()+"\nTelefono: 02"+getTelefono()
                +"\nDueño del vehiculo: "+getMarca()+" con tecnologia "+getTecnologia());
    }
}
class AutomovilAutonomo extends Automovil{
    private Calendar fechaComienzoFabricacionAutonomia;
    public AutomovilAutonomo(Calendar fechaComienzoFabricacionAutonomia){
        super();
        fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public AutomovilAutonomo(String nombrePropietario,int numeroCedula,
            int edadPropietario,String direccionPropietario,int telefono,
            String marca,String tecnologia, int modelo,
            Calendar fechaComienzoFabricacionAutonomia){

        super(nombrePropietario,numeroCedula,edadPropietario,direccionPropietario,
                telefono,marca,tecnologia,modelo);
        this.fechaComienzoFabricacionAutonomia=fechaComienzoFabricacionAutonomia;
    }
    public Calendar getFechaComienzoFabricacionAutonomia(){
        return fechaComienzoFabricacionAutonomia;
    }
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,"Datos del Automovil Autonomo:"
                + "\n MARCA DEL AUTOMOVIL: "+
                getMarca()+"\n"+getTecnologia()+
                "MATRICULA DEL AUTOMOVIL: "+getMatriculaAutomovil()
                +"\nFECHA DE FABRICACION: "
               +fechaComienzoFabricacionAutonomia.getTime().toString());
    }
    public void mostrarDatos1(){
        JOptionPane.showMessageDialog(null,"Datos del Propietario:"
                + "\nNombre del Propietario: "+
                getNombrePropietario()+"\nNúmero de cédula: "
                +getCedulaPropietario()+"\nEdad: "+getEdadPropietario()
                +" años"+"\nDirección: "+getDireccionPropietario()
                +"\nTelefono: 02"+getTelefono()+"\nDueño del vehiculo: "
                +getMarca()+" con tecnologia "+getTecnologia());
    }
}
class ListadoAutomoviles{
    private ArrayList<Automovil>ListadoAutomoviles;

    public ListadoAutomoviles(){
        ListadoAutomoviles=new ArrayList<Automovil>();
    }

    public void addAutomovil(Automovil automovil){
        ListadoAutomoviles.add(automovil);
    }
    public void Listar(){

        for(Automovil ObjetoTmp:ListadoAutomoviles){
            ObjetoTmp.mostrarDatos();{
            }
        }
    } }

class ListadoPropietarios{
    private ArrayList<Automovil>ListadoPropietarios;

    public ListadoPropietarios(){
        ListadoPropietarios=new ArrayList<Automovil>();
    }

    public void addAutomovil(Automovil automovil){
        ListadoPropietarios.add(automovil);
    }
    public void Listar(){
        for(Automovil ObjetoTmp:ListadoPropietarios){
            ObjetoTmp.mostrarDatos1();{
            }
        }
    }
}

public class SobreEscrituraMetodos2 {

    public static void main(String[] args) {

        Scanner eleccion = new Scanner(System.in);
        boolean salir = false;
        String op="";
        int opcion;
        String op1="";
        int opcion1;
        String op2="";
        int opcion2;
        String op3="";
        int opcion3;

        while (!salir){



        op=JOptionPane.showInputDialog(null,""
                +"\nLISTA CON DATOS DE LOS VEHICULOS Y DE LOS PROPIETARIOS.\n"
                + "\n1.INFORMACIÓN DEL AUTOMOVIL\n"
                + "\n2.INFORMACIÓN DEL PROPIETARIO\n"
                + "\n3.SALIR\n"
                + "\nIngrese una opción:\n");
        opcion=Integer.parseInt(op);
        switch(opcion){

            case 1:
                op1=JOptionPane.showInputDialog(null,"\nDATOS DE LOS AUTOMOVILES EXISTENTE EN EL LISTADO: \n"
                        + "\n1.NISSAN\n"
                        + "\n2.FORD\n"
                        + "\nSeleccione el automovil del que desea tener información\n");
                opcion1=Integer.parseInt(op1);
        switch(opcion1){
            case 1:
                Calendar fecha1=Calendar.getInstance();
                fecha1.set(2019,10,22);
                AutomovilAutonomo autonomo1=new AutomovilAutonomo("",0,0,"",0,"Nissan","TECNOLOGIA: EUROPEA\n",
                2020,fecha1);
                ListadoAutomoviles listado2=new ListadoAutomoviles();
                listado2.addAutomovil(autonomo1);
                listado2.Listar();
                break;

            case 2:
                Automovil automovil1=new Automovil("",0,0,"",0,"Ford","TECNOLOGIA: Canadiense\n",2018);
                automovil1.setMatriculaAutomovil("Ontario ABZM-264-20\n");
                ListadoAutomoviles listado1=new ListadoAutomoviles();
                listado1.addAutomovil(automovil1);
                listado1.Listar();
                break;
        }
        break;

            case 2:
                op2=JOptionPane.showInputDialog(null,"\nDATOS DE LOS PROPIETARIOS EXISTENTE EN EL LISTADO: \n"
                        + "\n1.Información del Propietario 1\n"
                        + "\n2.Información del Propietario 2\n"
                        + "\nSeleccione el propietario para saber su información\n");
                opcion2=Integer.parseInt(op2);
        switch(opcion2){
            case 1:
                Automovil automovil2=new Automovil("Julio Jiménez",1726739004,22,"Quito",2770689,"Ford","Canadiense",0);
                automovil2.setMatriculaAutomovil("Ontario ABZM-264-20\n");

                ListadoPropietarios listado3=new ListadoPropietarios();
                listado3.addAutomovil(automovil2);
                listado3.Listar();

                break;

            case 2:
                Automovil autonomo2=new Automovil("Lenin Iñacaza",1869265786,20,"Guayaqil",2721943,"Nissan","Europea",0);
                autonomo2.setMatriculaAutomovil("Ontario ABZM-264-20\n");

                ListadoPropietarios listado4=new ListadoPropietarios();
                listado4.addAutomovil(autonomo2);
                listado4.Listar();

                break;
            }break;
            case 3:

                op3=JOptionPane.showInputDialog(null,""
                        + "\nESTA SEGURO QUE DESEA SALIR DEL PROGRAMA:\n"
                        + "\n1.SI\n"
                        + "\n2.NO\n");
                opcion3=Integer.parseInt(op3);
                switch(opcion3){
                    case 1:
                        JOptionPane.showMessageDialog(null,"QUE TENGA UN EXCELENTE DIA,HASTA LA PROXIMA");
                        salir = true;
                        break;
                    case 2:
                        break;}
                break;
                default:
                JOptionPane.showMessageDialog(null,"\nLa opción que ingreso no es valida."
                        + "\nRecuerde que solo existen tres opciones en el Menu");
        }

      }

    }
}
