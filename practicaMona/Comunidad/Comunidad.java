package practicaMona;
    public class Comunidad extends PersonajeMona{
        String industria;

        Comunidad(String Pfsion, String ActPrin, String Act, String industria){
            super(Pfsion,ActPrin,Act);
            this.industria = industria;
        }

        String getInformacion(){
            return ("Profesion: " + getProfesion() + " Principal actividad: " + getActividadPrincipal() + " Actividades derivadas: " + getActividad() + " Industria: " + industria);
        }
    }
