class Player {
    String name;
    String game;
    Player(String name,String game)
    {
        this.name=name;
        this.game=game;
    }
    public void display()
    {
        System.out.println("PLayer Name: "+name);
        System.out.println("PLayer Game: "+game);
        
    }
    
}
class Cricket_player extends Player
{   int runs;
    Cricket_player(String name,String game,int runs)
    {
        super(name,game);
        this.runs=runs;
    }
   public void display(){
        super.display();
        System.out.println("Runs are: "+runs);
    }


}
class Football_player extends Player
{
    int goals;
    Football_player(String name,String game,int goals)
    {
        super(name,game);
        this.goals=goals;
    }
    public void display(){
        super.display();
        System.out.println("Goals are: "+goals);
    }

}
class Hockey_player extends Player
{
    int goals;
    Hockey_player(String name,String game,int goals)
    {
        super(name,game);
        this.goals=goals;
    }
    public void display(){
        super.display();
        System.out.println("Goals are : "+goals);
    }

}
 class Test{
    public static void main(String[] args) {
    Player obj1= new Cricket_player("Virat","Cricket", 100);
    obj1.display();
    Player obj2= new Football_player("Messi","Football", 4);
    obj2.display();
    Player obj3= new Hockey_player("Mandeep Singh","Hockey", 5);
    obj3.display();
        
    }
    

}
