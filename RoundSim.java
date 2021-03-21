public class RoundSim
{
    //im thinkin layouts are gonna be its own custom object
    public boolean Round(int roundNum) //layout will also be a param
    {
        //simulates a round and returns whether or not it will pass
        return getTotalVanillaBloonHealth(roundNum) =< getTotalDmg(); //THIS DOES NOT ACCOUNT FOR DIFFERENT IMMUNITIES (CAMO, ETC)
    }
    public float getTotalDmg() //layout will be a param
    {
        //calculates all the damage that will be done this round, returns it
    }
    public float getTotalVanillaBloonHealth(int roundNum)
    {
        //calculates the total balloon health of a round, should be ez
    }
    //diff balloon types: normal, camo, black, white, purple, lead, CL, CP, CPL?
    public float getTotalCamoBloonHealth(int roundNum)
    {

    }
}