import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends JFrame {

public Interfaz() {
	 this.setTitle("Interfaz");
     this.setSize(400,500);
     this.setLocationRelativeTo(null);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
     this.setLayout(null);
     
     //SPLASH
     
     /*
     JPanel splash = new JPanel();
     splash.setSize(500,700);
     splash.setLocation(0,0);
     splash.setLayout(null);
     splash.setBackground(Color.decode("#008891"));
     this.add(splash);
	
     JLabel imagen = new JLabel(new ImageIcon("1.png"));//AGREGA LA IMAGEN
     imagen.setSize(50,50);
     imagen.setLocation(170,90);
     splash.add(imagen);
		
     JLabel nombre = new JLabel ("Andres Eduardo Rubio Suarez",JLabel.CENTER);
     nombre.setSize(200,100);
     nombre.setLocation(90,370);
     nombre.setForeground(Color.white);
     JLabel nombre1 = new JLabel ("Angel Daniel Romero Carreño",JLabel.CENTER);
     nombre1.setSize(200,100);
     nombre1.setLocation(90,390);
     nombre1.setForeground(Color.white);
		
     splash.add(nombre);
     splash.add(nombre1);
     */
     
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
     
     JLabel imagen = new JLabel(new ImageIcon("1.png"));//AGREGA LA IMAGEN
     imagen.setSize(50,50);
     imagen.setLocation(170,90);
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
     
     JButton cancelar = new JButton("C a n c e l a r");
     cancelar.setSize(120,30);
     cancelar.setLocation(60,340);
     cancelar.setBackground(Color.red);
     cancelar.setForeground(Color.white);
     login.add(cancelar);
     
     JButton inicio = new JButton("A C C E D E R");
     inicio.setSize(120,30);
     inicio.setLocation(210,340);
     inicio.setBackground(Color.green);
     inicio.setForeground(Color.white);
     login.add(inicio);
     */
     
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
     
     JLabel saludo = new JLabel("Hola " + "Nombre de usuario");// Agregar el usuario
     saludo.setSize(200,50);
     saludo.setLocation(130,100);
     menu.add(saludo);
     
     JLabel imagen = new JLabel(new ImageIcon("1.png"));//AGREGA LA IMAGEN
     imagen.setSize(50,50);
     imagen.setLocation(170,180);
     menu.add(imagen);
     */

     //Mi cuenta
     
     
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
     
     JLabel saludo = new JLabel("Hola " + "Nombre de usuario");// Agregar el usuario
     saludo.setSize(200,50);
     saludo.setLocation(130,20);
     cuenta.add(saludo);
     
     JLabel imagen = new JLabel(new ImageIcon("1.png"));//AGREGA LA IMAGEN
     imagen.setSize(50,50);
     imagen.setLocation(170,70);
     cuenta.add(imagen);
     
     JLabel nombre = new JLabel("Nombre: ");
     nombre.setSize(100,20);
     nombre.setLocation(90, 180);
     cuenta.add(nombre);
     
     JTextField nom = new JTextField();
     nom.setSize(200,20);
     nom.setLocation(90,205);
     cuenta.add(nom);
     
     JLabel apellidos = new JLabel("Apellidos: ");
     apellidos.setSize(100,20);
     apellidos.setLocation(90, 230);
     cuenta.add(apellidos);
     
     JTextField ape = new JTextField();
     ape.setSize(200,20);
     ape.setLocation(90,255);
     cuenta.add(ape);
     
     JLabel email = new JLabel("Email: ");
     email.setSize(100,20);
     email.setLocation(90, 280);
     cuenta.add(email);
     
     JTextField mail = new JTextField();
     mail.setSize(200,20);
     mail.setLocation(90,305);
     cuenta.add(mail);
     
     JLabel contraseña = new JLabel("Contraseña: ");
     contraseña.setSize(100,20);
     contraseña.setLocation(90, 330);
     cuenta.add(contraseña);
     
     JTextField contra = new JTextField();
     contra.setSize(200,20);
     contra.setLocation(90,355);
     cuenta.add(contra);
     
     JButton cancelar = new JButton("C a n c e l a r");
     cancelar.setSize(120,30);
     cancelar.setLocation(55,390);
     cancelar.setBackground(Color.red);
     cancelar.setForeground(Color.white);
     cuenta.add(cancelar);
     
     JButton actualizar = new JButton("Actualizar Datos");
     actualizar.setSize(130,30);
     actualizar.setLocation(205,390);
     actualizar.setBackground(Color.green);
     actualizar.setForeground(Color.white);
     cuenta.add(actualizar);
     
     
     this.revalidate();
     this.repaint();
     
     
	}
}