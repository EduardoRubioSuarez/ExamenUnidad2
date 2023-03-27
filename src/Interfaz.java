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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
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
	    
	     //SE DEFINEN LAS VENTANAS
	     JPanel splash = new JPanel();
	     JPanel login = new JPanel();
	     JPanel menu = new JPanel();
	     JPanel cuenta = new JPanel();
	     JPanel listaU = new JPanel();
	     JPanel crear = new JPanel();
	     JPanel como = new JPanel();
	     
	     ////////////////////////////////////////////////////////////////////////////////////
	     //SPLASH
	     
	     splash.setSize(500,700);
	     splash.setLocation(0,0);
	     splash.setLayout(null);
	     splash.setBackground(Color.decode("#56ffff"));
	     this.add(splash);
		
	     JLabel imagenS = new JLabel(new ImageIcon("splash.png"));
	     imagenS.setSize(300,300);
	     imagenS.setLocation(55,30);
	     splash.add(imagenS);
	     		
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
	     
	     JProgressBar barraCarga = new JProgressBar();
	     barraCarga.setBounds(70,340,260,20);
	     barraCarga.setVisible(true);
	     
	     splash.add(nombre);
	     splash.add(nombre1);
	     splash.add(barraCarga);
	     
	     this.repaint();
	     
	     
	     int contadorBarra=0;
	     	while(contadorBarra<=100) {
	     		barraCarga.setValue(contadorBarra);
	    	 	try {
	    		 	Thread.sleep(20);
	    	 	} catch (InterruptedException e) {
	    		 	e.printStackTrace();
	    	 	}
	    	 	contadorBarra++;
	     	}
	     
	     this.remove(splash);

	     ////////////////////////////////////////////////////////////////////////////////////
	     //LOGIN
	     
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
	     
	     JLabel imagen1 = new JLabel(new ImageIcon("acceso.png"));
	     imagen1.setSize(120,120);
	     imagen1.setLocation(132,65);
	     login.add(imagen1);
	     
	     JLabel usuario = new JLabel ("Correo electronico:",JLabel.CENTER);
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
	     
	     JPasswordField pass = new JPasswordField();
	     pass.setSize(200,25);
	     pass.setLocation(90,280);
	     login.add(pass);
	     
	     JButton cancelar = new JButton("C A N C E L A R");
	     cancelar.setSize(130,30);
	     cancelar.setLocation(50,340);
	     cancelar.setBackground(Color.decode("#FF0000"));
	     cancelar.setForeground(Color.black);
	     login.add(cancelar);
	     
	     cancelar.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 nomU.setText("");
	    		 pass.setText("");
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     JButton inicio = new JButton("A C C E D E R");
	     inicio.setSize(130,30);
	     inicio.setLocation(210,340);
	     inicio.setBackground(Color.decode("#00FF97"));
	     inicio.setForeground(Color.black);
	     login.add(inicio);
	     
	     
	     /////// NO JALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	     inicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					BufferedReader  lector;
					lector = new BufferedReader(new FileReader("C:\\Users\\rubio\\Desktop\\Examen_U2\\ExamenU2\\Users.txt"));
					String line = lector.readLine();
					String contra = new String(pass.getPassword());
					int validar=0;
					while (line != null) {
						String [] arreglo  = line.split(",");
						if(nomU.getText().equals(arreglo[0]) && contra.equals(arreglo[3])) {
							validar = 1;
							JOptionPane.showMessageDialog(null,"Inicio de sesion correcto","Exito",JOptionPane.INFORMATION_MESSAGE);
							remove(login);
							add(menu);
							repaint();
							revalidate();
						}
						line = lector.readLine();
					}
					if(validar != 1 )
						JOptionPane.showMessageDialog(null,"Inicio de sesion incorrecto","Error", JOptionPane.ERROR_MESSAGE);
					lector.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}});
	     
	     ////////////////////////////////////////////////////////////////////////////////////
	     //Menu
	     
	     menu.setSize(500,700);
	     menu.setLocation(0,0);
	     menu.setLayout(null);
	     menu.setBackground(Color.decode("#008891"));
	     this.add(menu);
	     
	     JMenuBar barra1 = new JMenuBar();
	     barra1.setSize(500,20);
	     barra1.setLocation(0,0);
	     menu.add(barra1);
	     
	     JMenu micuenta = new JMenu("Cuenta");
	     barra1.add(micuenta);
	     
	     JMenuItem MiCuenta1 = new JMenuItem("Mi cuenta");
	     micuenta.add(MiCuenta1);
	     JMenuItem CerrarS1 = new JMenuItem("Cerrar sesion");
	     micuenta.add(CerrarS1);
	     
	     JMenu usuarios = new JMenu("Usuarios");
	     barra1.add(usuarios);
	     
	     JMenuItem ListaU1 = new JMenuItem("Lista de usuarios");
	     usuarios.add(ListaU1);
	     JMenuItem CrearU1 = new JMenuItem("Crear Usuario");
	     usuarios.add(CrearU1);
	     
	     JMenu ayuda = new JMenu("Ayuda");
	     
	     barra1.add(ayuda);
	     JMenuItem help1 = new JMenuItem("¿Como crear usuarios?");
	     ayuda.add(help1);
	     
	     MiCuenta1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(menu);
	    		 add(cuenta);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CerrarS1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(menu);
	    		 add(login);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     ListaU1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(menu);
	    		 add(listaU);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CrearU1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(menu);
	    		 add(crear);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     help1.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(menu);
	    		 add(como);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     
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
	     
	     
	     
	     ////////////////////////////////////////////////////////////////////////////////////
	     //Mi cuenta
	     
	     cuenta.setSize(500,700);
	     cuenta.setLocation(0,0);
	     cuenta.setLayout(null);
	     cuenta.setBackground(Color.decode("#008891"));
	     
	     JMenuBar barra2 = new JMenuBar();
	     barra2.setSize(500,20);
	     barra2.setLocation(0,0);
	     cuenta.add(barra2);
	     
	     JMenu micuenta2 = new JMenu("Cuenta");
	     barra2.add(micuenta2);
	     
	     JMenuItem MiCuenta2 = new JMenuItem("Mi cuenta");
	     micuenta2.add(MiCuenta2);
	     JMenuItem CerrarS2 = new JMenuItem("Cerrar sesion");
	     micuenta2.add(CerrarS2);
	     
	     JMenu usuarios2 = new JMenu("Usuarios");
	     barra2.add(usuarios2);
	     
	     JMenuItem ListaU2 = new JMenuItem("Lista de usuarios");
	     usuarios2.add(ListaU2);
	     JMenuItem CrearU2 = new JMenuItem("Crear Usuario");
	     usuarios2.add(CrearU2);
	     
	     JMenu ayuda2 = new JMenu("Ayuda");
	     barra2.add(ayuda2);
	     
	     JMenuItem help2 = new JMenuItem("¿Como crear usuarios?");
	     ayuda2.add(help2);
	     
	     MiCuenta2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(cuenta);
	    		 add(cuenta);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CerrarS2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(cuenta);
	    		 add(login);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     ListaU2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(cuenta);
	    		 add(listaU);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CrearU2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(cuenta);
	    		 add(crear);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     help2.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(cuenta);
	    		 add(como);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     
	     JLabel cuentap = new JLabel("Mi cuenta personal");
	     cuentap.setSize(200,50);
	     cuentap.setLocation(100,20);
	     cuentap.setFont(new Font("",Font.ROMAN_BASELINE,22));
	     cuentap.setForeground(Color.white);
	     cuenta.add(cuentap);
	     
	     JLabel imagen2 = new JLabel(new ImageIcon("cuenta.png"));//AGREGA LA IMAGEN
	     imagen2.setSize(110,110);
	     imagen2.setLocation(135,65);
	     cuenta.add(imagen2);
	     
	     JLabel nombre2 = new JLabel("Nombre: ");
	     nombre2.setSize(100,20);
	     nombre2.setLocation(90, 180);
	     nombre2.setForeground(Color.white);
	     cuenta.add(nombre2);
	     
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
	     
	     JButton bcancelar = new JButton("C A N C E L A R");
	     bcancelar.setSize(150,30);
	     bcancelar.setLocation(35,390);
	     bcancelar.setBackground(Color.decode("#FF0000"));
	     bcancelar.setForeground(Color.black);
	     cuenta.add(bcancelar);
	     
	     JButton actualizar = new JButton("ACTUALIZAR DATOS");
	     actualizar.setSize(150,30);
	     actualizar.setLocation(205,390);
	     actualizar.setBackground(Color.decode("#00FF97"));
	     actualizar.setForeground(Color.black);
	     cuenta.add(actualizar);
	     
	     

	     ////////////////////////////////////////////////////////////////////////////////////
	     //Lista de usuarios
	    
	     
	     listaU.setSize(500,700);
	     listaU.setLocation(0,0);
	     listaU.setLayout(null);
	     listaU.setBackground(Color.decode("#008891"));
	     
	     JMenuBar barra3 = new JMenuBar();
	     barra3.setSize(500,20);
	     barra3.setLocation(0,0);
	     listaU.add(barra3);
	     
	     JMenu micuenta3 = new JMenu("Cuenta");
	     barra3.add(micuenta3);
	     
	     JMenuItem MiCuenta3 = new JMenuItem("Mi cuenta");
	     micuenta3.add(MiCuenta3);
	     JMenuItem CerrarS3 = new JMenuItem("Cerrar sesion");
	     micuenta3.add(CerrarS3);
	     
	     JMenu usuarios3 = new JMenu("Usuarios");
	     barra3.add(usuarios3);
	     
	     JMenuItem ListaU3 = new JMenuItem("Lista de usuarios");
	     usuarios3.add(ListaU3);
	     JMenuItem CrearU3 = new JMenuItem("Crear Usuario");
	     usuarios3.add(CrearU3);
	     
	     JMenu ayuda3 = new JMenu("Ayuda");
	     barra3.add(ayuda3);
	     
	     JMenuItem help3 = new JMenuItem("¿Como crear usuarios?");
	     ayuda3.add(help3);
	     
	     MiCuenta3.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(listaU);
	    		 add(cuenta);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CerrarS3.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(listaU);
	    		 add(login);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     ListaU3.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(listaU);
	    		 add(listaU);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CrearU3.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(listaU);
	    		 add(crear);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     help3.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(listaU);
	    		 add(como);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
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
	     
	      

	     ////////////////////////////////////////////////////////////////////////////////////
	     //crear usuario
	     
	     crear.setSize(500,700);
	     crear.setLocation(0,0);
	     crear.setLayout(null);
	     crear.setBackground(Color.decode("#008891"));
	     
	     JMenuBar barra4 = new JMenuBar();
	     barra4.setSize(500,20);
	     barra4.setLocation(0,0);
	     crear.add(barra4);
	     
	     JMenu micuenta4 = new JMenu("Cuenta");
	     barra4.add(micuenta4);
	     
	     JMenuItem MiCuenta4 = new JMenuItem("Mi cuenta");
	     micuenta4.add(MiCuenta4);
	     JMenuItem CerrarS4 = new JMenuItem("Cerrar sesion");
	     micuenta4.add(CerrarS4);
	     
	     JMenu usuarios4 = new JMenu("Usuarios");
	     barra4.add(usuarios4);
	     
	     JMenuItem ListaU4 = new JMenuItem("Lista de usuarios");
	     usuarios4.add(ListaU4);
	     JMenuItem CrearU4 = new JMenuItem("Crear Usuario");
	     usuarios4.add(CrearU4);
	     
	     JMenu ayuda4 = new JMenu("Ayuda");
	     barra4.add(ayuda4);
	     
	     JMenuItem help4 = new JMenuItem("¿Como crear usuarios?");
	     ayuda4.add(help4);
	     
	     MiCuenta4.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(crear);
	    		 add(cuenta);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CerrarS4.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(crear);
	    		 add(login);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     ListaU4.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(crear);
	    		 add(listaU);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CrearU4.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(crear);
	    		 add(crear);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     help4.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(crear);
	    		 add(como);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     JLabel titulo2 = new JLabel ("Crear Usuario",JLabel.CENTER);
	     titulo2.setSize(390,50);
	     titulo2.setLocation(0,10);
	     titulo2.setForeground(Color.white);
	     titulo2.setFont(new Font("",Font.BOLD,24));
	     crear.add(titulo2);
	     
	     JLabel imagen3 = new JLabel(new ImageIcon("crear.png"));
	     imagen3.setSize(120,120);
	     imagen3.setLocation(132,55);
	     crear.add(imagen3);
	     
	     JLabel nombre3 = new JLabel ("Nombre completo:");
	     nombre3.setSize(200,100);
	     nombre3.setLocation(90,130);
	     nombre3.setForeground(Color.white);
	     crear.add(nombre3);
	     
	     JTextField nommbre1t = new JTextField();
	     nommbre1t.setSize(200,25);
	     nommbre1t.setLocation(90,190);
	     crear.add(nommbre1t);
	     
	     JLabel usuario1 = new JLabel ("Nombre de Usuario:");
	     usuario1.setSize(200,100);
	     usuario1.setLocation(90,175);
	     usuario1.setForeground(Color.white);
	     crear.add(usuario1);
	     
	     JTextField nomU1t = new JTextField();
	     nomU1t.setSize(200,25);
	     nomU1t.setLocation(90,235);
	     crear.add(nomU1t);
	     
	     JLabel email1 = new JLabel ("email:");
	     email1.setSize(200,100);
	     email1.setLocation(90,220);
	     email1.setForeground(Color.white);
	     crear.add(email1);
	     
	     JTextField email1t = new JTextField();
	     email1t.setSize(200,25);
	     email1t.setLocation(90,280);
	     crear.add(email1t);
	     
	     JLabel password1 = new JLabel ("Contraseña:");
	     password1.setSize(200,100);
	     password1.setLocation(90,265);
	     password1.setForeground(Color.white);
	     crear.add(password1);
	     
	     JTextField password1t = new JTextField();
	     password1t.setSize(200,25);
	     password1t.setLocation(90,325);
	     crear.add(password1t);
	     
	     JLabel password2 = new JLabel ("Confirma la contraseña:");
	     password2.setSize(200,100);
	     password2.setLocation(90,310);
	     password2.setForeground(Color.white);
	     crear.add(password2);
	     
	     JTextField password2t = new JTextField();
	     password2t.setSize(200,25);
	     password2t.setLocation(90,370);
	     crear.add(password2t);
	     
	     
	     JButton cancelar1 = new JButton("C A N C E L A R");
	     cancelar1.setSize(120,30);
	     cancelar1.setLocation(60,410);
	     cancelar1.setBackground(Color.decode("#FF0000"));
	     cancelar1.setForeground(Color.black);
	     crear.add(cancelar1);
	     
	     JButton creacion = new JButton("Crear Usuario");
	     creacion.setSize(120,30);
	     creacion.setLocation(210,410);
	     creacion.setBackground(Color.decode("#00FF97"));
	     creacion.setForeground(Color.black);
	     crear.add(creacion);
	     
	     ////////////////////////////////////////////////////////////////////////////////////
	     //help
	     
	     como.setSize(500,700);
	     como.setLocation(0,0);
	     como.setLayout(null);
	     como.setBackground(Color.decode("#008891"));
	     

	     JMenuBar barra5 = new JMenuBar();
	     barra5.setSize(500,20);
	     barra5.setLocation(0,0);
	     como.add(barra5);
	     
	     JMenu micuenta5 = new JMenu("Cuenta");
	     barra5.add(micuenta5);
	     
	     JMenuItem MiCuenta5 = new JMenuItem("Mi cuenta");
	     micuenta5.add(MiCuenta5);
	     JMenuItem CerrarS5 = new JMenuItem("Cerrar sesion");
	     micuenta5.add(CerrarS5);
	     
	     JMenu usuarios5 = new JMenu("Usuarios");
	     barra5.add(usuarios5);
	     
	     JMenuItem ListaU5 = new JMenuItem("Lista de usuarios");
	     usuarios5.add(ListaU5);
	     JMenuItem CrearU5 = new JMenuItem("Crear Usuario");
	     usuarios5.add(CrearU5);
	     
	     JMenu ayuda5 = new JMenu("Ayuda");
	     barra5.add(ayuda5);
	     
	     JMenuItem help5 = new JMenuItem("¿Como crear usuarios?");
	     ayuda5.add(help5);
	     
	     MiCuenta5.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(como);
	    		 add(cuenta);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CerrarS5.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(como);
	    		 add(login);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     ListaU5.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(como);
	    		 add(listaU);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     CrearU5.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(como);
	    		 add(crear);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     help5.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(como);
	    		 add(como);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
	     JLabel imagen4 = new JLabel(new ImageIcon("ayuda.png"));
	     imagen4.setSize(120,110);
	     imagen4.setLocation(132,55);
	     como.add(imagen4);
	     
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
	     
	     opcion.addActionListener(new ActionListener() {
	    	 @Override
	    	 public void actionPerformed(ActionEvent e) {
	    		 remove(como);
	    		 add(crear);
	    		 repaint();
	    		 revalidate();
	    	 }
	     });
	     
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
