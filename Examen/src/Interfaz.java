import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class Interfaz extends JFrame {
	
	public Interfaz() {
		 this.setTitle("Interfaz");
	     this.setSize(400,500);
	     this.setLocationRelativeTo(null);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     this.setVisible(true);
	     this.setLayout(null);
	    
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	     //SPLASH
	     /*
	     JPanel splash = new JPanel();
	     splash.setSize(500,700);
	     splash.setLocation(0,0);
	     splash.setLayout(null);
	     splash.setBackground(Color.decode("#56ffff"));
	     this.add(splash);
		
	     JLabel imagen = new JLabel(new ImageIcon("splash.png"));
	     imagen.setSize(300,300);
	     imagen.setLocation(55,30);
	     splash.add(imagen);
	     		
	     JLabel nombre = new JLabel ("Andres Eduardo Rubio Suarez",JLabel.CENTER);
	     nombre.setSize(300,100);
	     nombre.setFont(new Font("",Font.ITALIC,20));
	     nombre.setLocation(41,340);
	     nombre.setForeground(Color.decode("#211379"));
	     JLabel nombre1 = new JLabel ("Angel Daniel Romero Carreño",JLabel.CENTER);
	     nombre1.setSize(300,100);
	     nombre1.setFont(new Font("",Font.ITALIC,20));
	     nombre1.setLocation(40,370);
	     nombre1.setForeground(Color.decode("#211379"));
			
	     splash.add(nombre);
	     splash.add(nombre1);
	     */
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	     //LOGIN
	     
	     /*
	     JPanel login = new JPanel();
	     login.setSize(500,700);
	     login.setLocation(0,0);
	     login.setLayout(null);
	     login.setBackground(Color.decode("#008891"));
	     this.add(login);
	     
	     JLabel titulo1 = new JLabel ("Accede a tu cuenta",JLabel.CENTER);
	     titulo1.setSize(390,50);
	     titulo1.setLocation(0,10);
	     titulo1.setForeground(Color.white);
	     titulo1.setFont(new Font("",Font.BOLD,24));
	     login.add(titulo1);
	     
	     JLabel imagen = new JLabel(new ImageIcon("acceso.png"));
	     imagen.setSize(120,120);
	     imagen.setLocation(132,65);
	     login.add(imagen);
	     
	     JLabel usuario = new JLabel ("Nombre de Usuario:",JLabel.CENTER);
	     usuario.setSize(200,100);
	     usuario.setLocation(90,160);
	     usuario.setForeground(Color.white);
	     login.add(usuario);
	     
	     JTextField nomU = new JTextField();
	     nomU.setSize(200,25);
	     nomU.setLocation(90,225);
	     login.add(nomU);
	     
	     JLabel password = new JLabel ("Contraseña de acceso:",JLabel.CENTER);
	     password.setSize(200,100);
	     password.setLocation(90,215);
	     password.setForeground(Color.white);
	     login.add(password);
	     
	     JTextField pass = new JTextField();
	     pass.setSize(200,25);
	     pass.setLocation(90,280);
	     login.add(pass);
	     
	     
	     JButton cancelar = new JButton("C A N C E L A R");
	     cancelar.setSize(120,30);
	     cancelar.setLocation(60,340);
	     cancelar.setBackground(Color.decode("#FF0000"));
	     cancelar.setForeground(Color.black);
	    
	     login.add(cancelar);
	     
	     JButton inicio = new JButton("A C C E D E R");
	     inicio.setSize(120,30);
	     inicio.setLocation(210,340);
	     inicio.setBackground(Color.decode("#00FF97"));
	     inicio.setForeground(Color.black);
	     login.add(inicio);
	     */
	     
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	     //Menu
	     
	     /*	  
	     JPanel menu = new JPanel();
	     menu.setSize(500,700);
	     menu.setLocation(0,0);
	     menu.setLayout(null);
	     menu.setBackground(Color.decode("#008891"));
	     this.add(menu);
	     
	     JMenuBar barra = new JMenuBar();
	     barra.setSize(500,20);
	     barra.setLocation(0,0);
	     menu.add(barra);
	     
	     JMenu cuenta = new JMenu("Cuenta");
	     barra.add(cuenta);
	     JMenuItem miCuenta = new JMenuItem("Mi cuenta");
	     cuenta.add(miCuenta);
	     JMenuItem cerrarS = new JMenuItem("Cerrar sesion");
	     cuenta.add(cerrarS);
	     
	     JMenu usuarios = new JMenu("Usuarios");
	     barra.add(usuarios);
	     JMenuItem listaU = new JMenuItem("Lista de usuarios");
	     usuarios.add(listaU);
	     JMenuItem crearU = new JMenuItem("Crear Usuario");
	     usuarios.add(crearU);
	     
	     JMenu ayuda = new JMenu("Ayuda");
	     barra.add(ayuda);
	     JMenuItem help = new JMenuItem("¿Como crear usuarios?");
	     ayuda.add(help);
	     
	     JLabel saludo = new JLabel("Bienvenido " + "Nombre de usuario");
	     saludo.setSize(400,50);
	     saludo.setLocation(40,70);
	     saludo.setFont(new Font("",Font.HANGING_BASELINE,22));
	     saludo.setForeground(Color.white);
	     menu.add(saludo);
	     
	     JLabel imagen = new JLabel(new ImageIcon("menu.png"));//AGREGA LA IMAGEN
	     imagen.setSize(250,250);
	     imagen.setLocation(65,160);
	     menu.add(imagen);
	     */
	     
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	     //Mi cuenta
	     
	     /*
	     JPanel cuenta = new JPanel();
	     cuenta.setSize(500,700);
	     cuenta.setLocation(0,0);
	     cuenta.setLayout(null);
	     cuenta.setBackground(Color.decode("#008891"));
	     this.add(cuenta);
	     
	     JMenuBar barra = new JMenuBar();
	     barra.setSize(500,20);
	     barra.setLocation(0,0);
	     cuenta.add(barra);
	     
	     JMenu cuenta2 = new JMenu("Cuenta");
	     barra.add(cuenta2);
	     JMenuItem miCuenta = new JMenuItem("Mi cuenta");
	     cuenta2.add(miCuenta);
	     JMenuItem cerrarS = new JMenuItem("Cerrar sesion");
	     cuenta2.add(cerrarS);
	     
	     JMenu usuarios = new JMenu("Usuarios");
	     barra.add(usuarios);
	     JMenuItem listaU = new JMenuItem("Lista de usuarios");
	     usuarios.add(listaU);
	     JMenuItem crearU = new JMenuItem("Crear Usuario");
	     usuarios.add(crearU);
	     
	     JMenu ayuda = new JMenu("Ayuda");
	     barra.add(ayuda);
	     JMenuItem help = new JMenuItem("¿Como crear usuarios?");
	     ayuda.add(help);
	     
	     JLabel lugar = new JLabel("Mi cuenta personal");
	     lugar.setSize(200,50);
	     lugar.setLocation(100,20);
	     lugar.setFont(new Font("",Font.ROMAN_BASELINE,22));
	     lugar.setForeground(Color.white);
	     cuenta.add(lugar);
	     
	     JLabel imagen = new JLabel(new ImageIcon("cuenta.png"));//AGREGA LA IMAGEN
	     imagen.setSize(110,110);
	     imagen.setLocation(135,65);
	     cuenta.add(imagen);
	     
	     JLabel nombre = new JLabel("Nombre: ");
	     nombre.setSize(100,20);
	     nombre.setLocation(90, 180);
	     nombre.setForeground(Color.white);
	     cuenta.add(nombre);
	     
	     JTextField nom = new JTextField();
	     nom.setSize(200,20);
	     nom.setLocation(90,205);
	     cuenta.add(nom);
	     
	     JLabel apellidos = new JLabel("Apellidos: ");
	     apellidos.setSize(100,20);
	     apellidos.setLocation(90, 230);
	     apellidos.setForeground(Color.white);
	     cuenta.add(apellidos);
	     
	     JTextField ape = new JTextField();
	     ape.setSize(200,20);
	     ape.setLocation(90,255);
	     cuenta.add(ape);
	     
	     JLabel email = new JLabel("Email: ");
	     email.setSize(100,20);
	     email.setLocation(90, 280);
	     email.setForeground(Color.white);
	     cuenta.add(email);
	     
	     JTextField mail = new JTextField();
	     mail.setSize(200,20);
	     mail.setLocation(90,305);
	     cuenta.add(mail);
	     
	     JLabel contraseña = new JLabel("Contraseña: ");
	     contraseña.setSize(100,20);
	     contraseña.setLocation(90, 330);
	     contraseña.setForeground(Color.white);
	     cuenta.add(contraseña);
	     
	     JTextField contra = new JTextField();
	     contra.setSize(200,20);
	     contra.setLocation(90,355);
	     cuenta.add(contra);
	     
	     JButton cancelar = new JButton("C A N C E L A R");
	     cancelar.setSize(150,30);
	     cancelar.setLocation(35,390);
	     cancelar.setBackground(Color.decode("#FF0000"));
	     cancelar.setForeground(Color.black);
	     cuenta.add(cancelar);
	     
	     JButton actualizar = new JButton("ACTUALIZAR DATOS");
	     actualizar.setSize(150,30);
	     actualizar.setLocation(205,390);
	     actualizar.setBackground(Color.decode("#00FF97"));
	     actualizar.setForeground(Color.black);
	     cuenta.add(actualizar);
	     */
	     
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	     //Lista de usuarios
	     /*
	     JPanel listaU = new JPanel();
	     listaU.setSize(500,700);
	     listaU.setLocation(0,0);
	     listaU.setLayout(null);
	     listaU.setBackground(Color.decode("#008891"));
	     this.add(listaU);
	     
	     JMenuBar barra = new JMenuBar();
	     barra.setSize(500,20);
	     barra.setLocation(0,0);
	     listaU.add(barra);
	     
	     JMenu cuenta2 = new JMenu("Cuenta");
	     barra.add(cuenta2);
	     JMenuItem miCuenta = new JMenuItem("Mi cuenta");
	     cuenta2.add(miCuenta);
	     JMenuItem cerrarS = new JMenuItem("Cerrar sesion");
	     cuenta2.add(cerrarS);
	     
	     JMenu usuarios = new JMenu("Usuarios");
	     barra.add(usuarios);
	     JMenuItem lista = new JMenuItem("Lista de usuarios");
	     usuarios.add(lista);
	     JMenuItem crearU = new JMenuItem("Crear Usuario");
	     usuarios.add(crearU);
	     
	     JMenu ayuda = new JMenu("Ayuda");
	     barra.add(ayuda);
	     JMenuItem help = new JMenuItem("¿Como crear usuarios?");
	     ayuda.add(help);
	     
	     JLabel lugar = new JLabel("Lista de usuarios");
	     lugar.setSize(200,50);
	     lugar.setLocation(100,20);
	     lugar.setFont(new Font("",Font.ROMAN_BASELINE,22));
	     lugar.setForeground(Color.white);
	     listaU.add(lugar);
	     
	     JLabel Editar = new JLabel("Editar");
	     Editar.setSize(100,50);
	     Editar.setLocation(70,90);
	     Editar.setFont(new Font("",Font.ROMAN_BASELINE,20));
	     Editar.setForeground(Color.white);
	     listaU.add(Editar);
	     
	     JComboBox<String> seleccion = new JComboBox<String>();
	     seleccion.addItem("Seleccione usuario");
	     seleccion.setSize(250,25);
	     seleccion.setLocation(70,130);
	     listaU.add(seleccion);
	     
	     JButton aceptarE = new JButton("Editar " + "''" + "Nombre de usuario" + "''");
	     aceptarE.setSize(250,25);
	     aceptarE.setLocation(70,160);
	     aceptarE.setBackground(Color.decode("#00FF97"));
	     listaU.add(aceptarE);
	     
	     JButton borrar = new JButton();
	     listaU.add(aceptarE);
	     
	     String [] columnas  =  {"Usuario","Nombre","accion"}; 
	     Object [][] data  =  new Object [3][2];
	     
	     DefaultTableModel dmt = new DefaultTableModel(data,columnas);
			
	     JPanel fondoT = new JPanel();
	     fondoT.setSize(300,200);
	     fondoT.setLocation(40,220);
	     fondoT.setBackground(Color.decode("#008891"));
	     listaU.add(fondoT);
	     
	     JTable tabla = new JTable(dmt);
	     JScrollPane js = new JScrollPane(tabla);
	     js.setPreferredSize(new Dimension(290,190));
	     
	     fondoT.add(js);
	     
	     TableColumn agregarColumn;
	     agregarColumn = tabla.getColumnModel().getColumn(2);
	     agregarColumn.setCellEditor(new myeditor(tabla));
	     agregarColumn.setCellRenderer(new myrenderer(true));
	     */
	      
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	     //crear usuario
	     
	     /*
	     JPanel crear = new JPanel();
	     crear.setSize(500,700);
	     crear.setLocation(0,0);
	     crear.setLayout(null);
	     crear.setBackground(Color.decode("#008891"));
	     this.add(crear);
	     
	     JMenuBar barra = new JMenuBar();
	     barra.setSize(500,20);
	     barra.setLocation(0,0);
	     crear.add(barra);
	     
	     JMenu cuenta2 = new JMenu("Cuenta");
	     barra.add(cuenta2);
	     JMenuItem miCuenta = new JMenuItem("Mi cuenta");
	     cuenta2.add(miCuenta);
	     JMenuItem cerrarS = new JMenuItem("Cerrar sesion");
	     cuenta2.add(cerrarS);
	     
	     JMenu usuarios = new JMenu("Usuarios");
	     barra.add(usuarios);
	     JMenuItem lista = new JMenuItem("Lista de usuarios");
	     usuarios.add(lista);
	     JMenuItem crearU = new JMenuItem("Crear Usuario");
	     usuarios.add(crearU);
	     
	     JMenu ayuda = new JMenu("Ayuda");
	     barra.add(ayuda);
	     JMenuItem help = new JMenuItem("¿Como crear usuarios?");
	     ayuda.add(help);
	     
	     JLabel titulo1 = new JLabel ("Crear Usuario",JLabel.CENTER);
	     titulo1.setSize(390,50);
	     titulo1.setLocation(0,10);
	     titulo1.setForeground(Color.white);
	     titulo1.setFont(new Font("",Font.BOLD,24));
	     crear.add(titulo1);
	     
	     JLabel imagen = new JLabel(new ImageIcon("crear.png"));
	     imagen.setSize(120,120);
	     imagen.setLocation(132,55);
	     crear.add(imagen);
	     
	     JLabel nombre = new JLabel ("Nombre completo:");
	     nombre.setSize(200,100);
	     nombre.setLocation(90,130);
	     nombre.setForeground(Color.white);
	     crear.add(nombre);
	     
	     JTextField nommbre = new JTextField();
	     nommbre.setSize(200,25);
	     nommbre.setLocation(90,190);
	     crear.add(nommbre);
	     
	     JLabel usuario = new JLabel ("Nombre de Usuario:");
	     usuario.setSize(200,100);
	     usuario.setLocation(90,175);
	     usuario.setForeground(Color.white);
	     crear.add(usuario);
	     
	     JTextField nomU = new JTextField();
	     nomU.setSize(200,25);
	     nomU.setLocation(90,235);
	     crear.add(nomU);
	     
	     JLabel email = new JLabel ("email:");
	     email.setSize(200,100);
	     email.setLocation(90,220);
	     email.setForeground(Color.white);
	     crear.add(email);
	     
	     JTextField mail = new JTextField();
	     mail.setSize(200,25);
	     mail.setLocation(90,280);
	     crear.add(mail);
	     
	     JLabel password = new JLabel ("Contraseña:");
	     password.setSize(200,100);
	     password.setLocation(90,265);
	     password.setForeground(Color.white);
	     crear.add(password);
	     
	     JTextField pass = new JTextField();
	     pass.setSize(200,25);
	     pass.setLocation(90,325);
	     crear.add(pass);
	     
	     JLabel password2 = new JLabel ("Confirma la contraseña:");
	     password2.setSize(200,100);
	     password2.setLocation(90,310);
	     password2.setForeground(Color.white);
	     crear.add(password2);
	     
	     JTextField pass2 = new JTextField();
	     pass2.setSize(200,25);
	     pass2.setLocation(90,370);
	     crear.add(pass2);
	     
	     
	     JButton cancelar = new JButton("C A N C E L A R");
	     cancelar.setSize(120,30);
	     cancelar.setLocation(60,410);
	     cancelar.setBackground(Color.decode("#FF0000"));
	     cancelar.setForeground(Color.black);
	     crear.add(cancelar);
	     
	     JButton creacion = new JButton("Crear Usuario");
	     creacion.setSize(120,30);
	     creacion.setLocation(210,410);
	     creacion.setBackground(Color.decode("#00FF97"));
	     creacion.setForeground(Color.black);
	     crear.add(creacion);
	     */
	     
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
	     //help
	     
	     JPanel como = new JPanel();
	     como.setSize(500,700);
	     como.setLocation(0,0);
	     como.setLayout(null);
	     como.setBackground(Color.decode("#008891"));
	     this.add(como);
	     
	     JMenuBar barra = new JMenuBar();
	     barra.setSize(500,20);
	     barra.setLocation(0,0);
	     como.add(barra);
	     
	     JMenu cuenta2 = new JMenu("Cuenta");
	     barra.add(cuenta2);
	     JMenuItem miCuenta = new JMenuItem("Mi cuenta");
	     cuenta2.add(miCuenta);
	     JMenuItem cerrarS = new JMenuItem("Cerrar sesion");
	     cuenta2.add(cerrarS);
	     
	     JMenu usuarios = new JMenu("Usuarios");
	     barra.add(usuarios);
	     JMenuItem lista = new JMenuItem("Lista de usuarios");
	     usuarios.add(lista);
	     JMenuItem crearU = new JMenuItem("Crear Usuario");
	     usuarios.add(crearU);
	     
	     JMenu ayuda = new JMenu("Ayuda");
	     barra.add(ayuda);
	     JMenuItem help = new JMenuItem("¿Como crear usuarios?");
	     ayuda.add(help);
	     
	     JLabel titulo1 = new JLabel ("¿Como crear Usuario?",JLabel.CENTER);
	     titulo1.setSize(390,50);
	     titulo1.setLocation(0,10);
	     titulo1.setForeground(Color.white);
	     titulo1.setFont(new Font("",Font.BOLD,24));
	     como.add(titulo1);
	     
	     JLabel imagen = new JLabel(new ImageIcon("ayuda.png"));
	     imagen.setSize(120,120);
	     imagen.setLocation(132,55);
	     como.add(imagen);
	     
	     JPanel info = new JPanel();
	     info.setSize(250,250);
	     info.setLocation(67,185);
	     info.setBackground(Color.decode("#3EB2BE"));
	     como.add(info);
	     
	     JTextArea pasos = new JTextArea("1.-Hacer click en la opción “Usuarios”"
	     		+ "\n" + "    en el menú superior" + "\n" + "\n" + "2.-Hacer click en la opción “Crear Usuario”"
	     				+ "\n" + "    en el menú desplegado" + "\n"
	     + "\n" + "3.-Llenar los campos solicitados" + "\n" + "\n" + "4.-Hacer click en el botón “Crear Usuario”" + "\n" + "\n" + "5.-Listo, el usuario se ha creado");
	     pasos.setPreferredSize(new Dimension(240,200));
	     pasos.setBackground(Color.decode("#3EB2BE"));
	     pasos.setLocation(125,10);
	     info.add(pasos);
	     
	     JButton opcion = new JButton("Crear un usuario ahora");
	     opcion.setSize(120,30);
	     opcion.setLocation(60,410);
	     opcion.setBackground(Color.decode("#00E7FF"));
	     opcion.setForeground(Color.black);
	     info.add(opcion);
	     
	     this.revalidate();
	     this.repaint();
	     
	     
	     
	}
	
	public class myrenderer extends JLabel implements TableCellRenderer {

	    boolean isBordered = true;

	    public myrenderer(boolean isBordered) {
	        this.isBordered = isBordered;
	        setOpaque(true);
	    }

	    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {
	        // Va a mostrar el botón solo en la última fila.
	        // de otra forma muestra un espacio en blanco.
	        if (row == table.getModel().getRowCount() - 3) {//Hacer un contador
	            return new JButton("Eliminar");
	        } else {
	            setBackground(new Color(0xffffff));
	            return this;
	        }
	    }
	}
	
	public class myeditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

	    Boolean currentValue;
	    JButton button;
	    protected static final String EDIT = "edit";
	    private JTable tabla;

	    public myeditor(JTable tabla) {
	        button = new JButton();
	        button.setActionCommand(EDIT);
	        button.addActionListener(this);
	        button.setBorderPainted(false);
	        this.tabla = tabla;
	    }

	    public void actionPerformed(ActionEvent e) {
	        fireEditingStopped();
	    }

	   
	    public Object getCellEditorValue() {
	        return currentValue;
	    }

	    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
	        // Va a mostrar el botón solo en la última fila.
	        // de otra forma muestra un espacio en blanco.
	        if (row == table.getModel().getRowCount() - 1) {
	            currentValue = (Boolean) value;
	            return button;
	        }
	        return new JLabel();
	    }
	}
	
	

}
