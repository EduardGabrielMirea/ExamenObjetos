package entidadBanco;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Banco b1 = new Banco("Bankia");

            Scucrsal s1 = new Scucrsal("Sucursal 1");
            b1.addSucursal(s1);

            Domiciliacion d1 = new Domiciliacion(1);
            Domiciliacion d2= new Domiciliacion(2);
                CuentaCorriente cc1 = new CuentaCorriente("CC 1");
                s1.addCC(cc1);
                cc1.addDomi(d1);


                CuentaCorriente cc2 = new CuentaCorriente("CC 2");
                s1.addCC(cc2);
                cc2.addDomi(d2);

                        Cliente c1 = new Cliente("Eddy","x111x");
                            cc1.addCliente(c1);
                            c1.addCC(cc1);

                                Prestamo p1 = new Prestamo(1,1000);
                                c1.addPrestamos(p1);
                                s1.addPrestamo(p1);


                                Prestamo p2 = new Prestamo(2,2000);
                                c1.addPrestamos(p2);
                                s1.addPrestamo(p2);

                        Cliente c2 = new Cliente("Juan","x222x");
                            cc2.addCliente(c2);
                            c2.addCC(cc2);

                                Prestamo p3 = new Prestamo(1,1500);
                                    c2.addPrestamos(p3);
                                    s1.addPrestamo(p3);


                                Prestamo p4 = new Prestamo(2,1700);
                                    c2.addPrestamos(p4);
                                    s1.addPrestamo(p4);



            Scucrsal s2 = new Scucrsal("Sucursal 2");
            b1.addSucursal(s2);

                CuentaCorriente cc3 = new CuentaCorriente("CC 3");
                    s2.addCC(cc3);
                    cc3.addDomi(d1);
                CuentaCorriente cc4 = new CuentaCorriente("CC 4");
                    s2.addCC(cc4);
                    cc4.addDomi(d2);

                        Cliente c3 = new Cliente("Pepe","x333x");
                            cc3.addCliente(c3);
                            c3.addCC(cc3);

                                Prestamo p5 = new Prestamo(1,2200);
                                    c3.addPrestamos(p5);
                                    s2.addPrestamo(p5);


                                Prestamo p6 = new Prestamo(2,3000);
                                    c3.addPrestamos(p6);
                                    s2.addPrestamo(p6);


                        Cliente c4 = new Cliente("Adrian","x444x");
                            cc4.addCliente(c4);
                            c4.addCC(cc4);

                                Prestamo p7 = new Prestamo(1,3240);
                                    c4.addPrestamos(p7);
                                    s2.addPrestamo(p7);

                                Prestamo p8 = new Prestamo(2,2000);
                                    c4.addPrestamos(p8);
                                    s2.addPrestamo(p8);


              System.out.println("\n"+b1);
              for (Scucrsal scucrsal: b1.getScucrsals()){
                  System.out.println("\t"+scucrsal);
                  for (CuentaCorriente cuentaCorriente: scucrsal.getCuentaCorrientes()){
                      System.out.println("\t\t"+cuentaCorriente);
                      for (Cliente cliente: cuentaCorriente.getClientes()){
                          System.out.println("\t\t\t"+cliente);
                          for (Prestamo prestamo: cliente.getPrestamos()){
                              System.out.println("\t\t\t\t"+prestamo);
                          }
                      }
                      for (Domiciliacion domiciliacion: cuentaCorriente.getDomiciliacions()){
                          System.out.println(domiciliacion);
                      }
                  }
              }
          }
}
