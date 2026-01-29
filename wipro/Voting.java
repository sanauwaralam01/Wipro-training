public class Voting {
    private String VotingRights;
    private String Identity;
    public void setVoting(String VotingRights, String Identity){
        this.VotingRights=VotingRights;
        this.Identity=Identity;
    }
    public String getVotingRights(){
        return VotingRights;
    }
    public String getIdentity(){
        return Identity;
    }
    public static void main(String[]args){
        Voting voter=new Voting();
        voter.setVoting("eligible","Sanauwar");
        System.out.println(voter);
        
    }
    
}
