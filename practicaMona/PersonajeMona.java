package practicaMona;
    public class PersonajeMona extends Octodex{
        private String actividadDerivada;

        PersonajeMona(String Pfsion, String ActPrin, String Act){
            super(Pfsion,ActPrin);
            this.actividadDerivada = Act;
        }

        String getActividad(){
            return actividadDerivada;
        }

        String getInformacionMona(){
            return ("Profesion: " + getProfesion() + " Principal actividad: " + getActividadPrincipal() + " Actividades derivadas: " + getActividad());
        }
    }
