    import java.util.Scanner;

    public class CajeroAutomatico {
        public static void main(String[] args) {
            Scanner src = new Scanner(System.in);

            String accion;
            int cantidad = 0;
            boolean activo = true;
            float saldo = 0;

            while (activo){
                accion = src.next();

                switch (accion){
                    case "INGRESSAR":
                        cantidad = src.nextInt();
                        saldo += (float) cantidad;
                        System.out.printf("Ingres realitzat: " + "%.2f%n",(float) cantidad);
                        System.out.printf(">> Saldo: " + "%.2f%n",saldo);
                        break;
                    case "CONSULTAR":
                        System.out.printf(">> Saldo: " + "%.2f%n",saldo);
                        break;
                    case "RETIRAR":
                        cantidad = src.nextInt();
                        if (cantidad <= saldo) {
                            saldo -= (float) cantidad;
                            System.out.printf("Retirar diners -> " + "%.2f%n",(float) cantidad);
                            System.out.printf(">> Saldo: " + "%.2f%n",saldo);
                        }
                        else {
                            System.out.println("Saldo insuficient");
                            System.out.printf(">> Saldo: " + "%.2f%n",saldo);
                        }
                        break;
                    case "SORTIR":
                        activo = false;
                        break;
                }

            }
        }
    }
