    package PracticaHerencia;

    public class PersonajeVideojuego {
        static void main(String[] args) {
            Guerrero g1 = new Guerrero("Goku", 100, 50, 30, 80, 20);
            Mago m1 = new Mago("Merlin", 80, 30, 20, 100, 50);

            while(g1.getVida() > 0 && m1.getVida() > 0) {
                int ataque = (int) (Math.random() * 1);
                if (ataque == 0) {
                    int dano = g1.getAtaque() + g1.getFuerza() - m1.getDefensa();
                    m1.setVida(m1.getVida() - dano);
                    System.out.println(g1.getNombre() + " ataca a " + m1.getNombre() + " y le hace " + dano + " de daño. Vida restante de " + m1.getNombre() + ": " + m1.getVida());
                } else if (ataque == 1) {
                    int dano = m1.getAtaque() + m1.getPoderMagico() - g1.getDefensa();
                    g1.setVida(g1.getVida() - dano);
                    System.out.println(m1.getNombre() + " ataca a " + g1.getNombre() + " y le hace " + dano + " de daño. Vida restante de " + g1.getNombre() + ": " + g1.getVida());
                }

            }
        }
    }


    class Personaje {
        private String nombre;
        private int vida;
        private int defensa;
        private int ataque;

        public Personaje(String nombre, int vida, int defensa, int ataque) {
            this.nombre = nombre;
            this.vida = vida;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setAtaque(int ataque) {
            this.ataque = ataque;
        }

        public void setDefensa(int defensa) {
            this.defensa = defensa;
        }

        public void setVida(int vida) {
            this.vida = vida;
        }

        public String getNombre() {
            return nombre;
        }

        public int getVida() {
            return vida;
        }

        public int getDefensa() {
            return defensa;
        }

        public int getAtaque() {
            return ataque;
        }
    }

    class Guerrero extends Personaje {
        private int fuerza;
        private int armadura;

        public Guerrero(String nombre, int vida, int defensa, int ataque, int fuerza, int armadura) {
            super(nombre, vida, defensa, ataque);
            this.fuerza = fuerza;
            this.armadura = armadura;
        }

        public int getArmadura() {
            return armadura;
        }

        public int getFuerza() {
            return fuerza;
        }

        public void setFuerza(int fuerza) {
            this.fuerza = fuerza;
        }

        public void setArmadura(int armadura) {
            this.armadura = armadura;
        }
    }


    class Mago extends Personaje {
        private int mana;
        private int poderMagico;

        public Mago(String nombre, int vida, int defensa, int ataque, int mana, int inteligencia) {
            super(nombre, vida, defensa, ataque);
            this.mana = mana;
            this.poderMagico = inteligencia;
        }

        public int getPoderMagico() {
            return poderMagico;
        }

        public int getMana() {
            return mana;
        }

        public void setPoderMagico(int poderMagico) {
            this.poderMagico = poderMagico;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }
    }
