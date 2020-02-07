public class SoccerTeam {
 private int wins;
 private int losses;
 private int ties;
 private static int games=0;
 private static int goals=0;
 public SoccerTeam(int w, int l, int t){
     wins=w;
     losses=l;
     ties=t;


 }
 public SoccerTeam(){
     wins=0;
     losses=0;
     ties=0;
 }
 public void played(SoccerTeam other, int myScore, int otherScore){
     games++;
     goals+=myScore+otherScore;
     if (myScore==otherScore){
         this.ties++;
         other.ties++;
     }
     else if (myScore>otherScore){
         this.wins++;
         other.losses++;
     }
     else{
         other.wins++;
         this.losses++;

     }

 }
 public int getPoints(){
     return wins*3+ties;
 }

 public void reset(){
     wins=0;
     losses=0;
     ties=0;

 }

 public static void StartTournament(){
     goals=0;
     games=0;
 }






}
