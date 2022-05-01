package practicaMona;
    public class Octodex {
        private String profesion;
        private String actividadPrincipal;

        Octodex(String Profesion, String actPrin){
            this.profesion = Profesion;
            this.actividadPrincipal = actPrin;
        }

        String getProfesion(){
            return profesion;
        }

        String getActividadPrincipal(){
            return actividadPrincipal;
        }
    }
