import java.util.*;

public class StreetFighter {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String estado = src.next();
        String evento = src.next();

        String nuevoEstado = estado;

        switch (estado) {
            case "IDLE":
                if (evento.equals("JOYSTICK_UP")) nuevoEstado = "JUMPING";
                else if (evento.equals("JOYSTICK_LEFT/RIGHT")) nuevoEstado = "WALKING";
                else if (evento.equals("JOYSTICK_CENTER")) nuevoEstado = "IDLE";
                else if (evento.equals("PUNCH_KEY")) nuevoEstado = "PUNCHING";
                else if (evento.equals("KICK_KEY")) nuevoEstado = "KICKING";
                break;

            case "WALKING":
                if (evento.equals("JOYSTICK_CENTER")) nuevoEstado = "IDLE";
                else if (evento.equals("JOYSTICK_LEFT/RIGHT")) nuevoEstado = "WALKING";
                else if (evento.equals("PUNCH_KEY")) nuevoEstado = "PUNCHING";
                else if (evento.equals("KICK_KEY")) nuevoEstado = "KICKING";
                break;

            case "JUMPING":
                if (evento.equals("TOUCH_FLOOR")) nuevoEstado = "IDLE";
                else if (evento.equals("KICK_KEY")) nuevoEstado = "KICKING";
                else nuevoEstado = "JUMPING";
                break;

            case "PUNCHING":
                if (evento.equals("PUNCH_END")) nuevoEstado = "IDLE";
                else nuevoEstado = "PUNCHING";
                break;

            case "KICKING":
                if (evento.equals("KICK_END")) nuevoEstado = "IDLE";
                else nuevoEstado = "KICKING";
                break;
        }

        System.out.println(nuevoEstado);
    }
}
