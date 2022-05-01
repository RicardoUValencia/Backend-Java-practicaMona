package practicaMona;
    public class Principal {
        public static void main(String[] args) {
            System.out.println("******* Octonaut *******\n");
            Astronauta astrMona = new Astronauta("Astonauta \n",
                    "Fabricación de cualquier objeto diseñado para salir de la Tierra y a todos los servicios relacionados con su viaje por el espacio \n",
                    "Monitorear componentes de los objetos diseñados \n",
                    "Espacial\n");
            System.out.println(astrMona.getInformacion());

            System.out.println("******* Catstello *******\n");
            DJ DjMona = new DJ("Disk Jockey\n",
                    "Crear y tocar musica en conciertos\n",
                    "Estar en TV\n",
                    "Musical\n");
            System.out.println(DjMona.getInformacion());

            System.out.println("******* Ironcats *******\n");
            IronMan IronMona = new IronMan("Ingeniera Eléctrica\n",
                    "Pelear con villanos y salvar al planeta de una invasion alienigena\n",
                    "Construir sofisticada armadura de IronMan\n",
                    "Stark\n");
            System.out.println(IronMona.getInformacion());

            System.out.println("******* Inspectocat *******\n");
            Inspector InspectMona = new Inspector("Investigadora\n",
                    "Revisar e inspeccionar codigo a detalle\n",
                    "Resolver problemas algoritmicos y errores de compilacion\n",
                    "Investigacion industrial\n");
            System.out.println(InspectMona.getInformacion());

            System.out.println("******* Benevocats *******\n");
            Comunidad comunityMona = new Comunidad("Ingeniera Ambiental\n",
                    "Tratamiento de residuos de todo tipo\n",
                    "Crear comunidades para fomentar el cuidado del medio ambiente\n",
                    "Ambiental\n");
            System.out.println(comunityMona.getInformacion());

            System.out.println("******* Spidertocat *******\n");
            Spider spiderMona = new Spider("Salvar vidas en peligro\n",
                    "Estudiar\n",
                    "Visitar a su familia\n",
                    "Sin definir\n");
            System.out.println(comunityMona.getInformacion());
        }
    }
