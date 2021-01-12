package de.rge.rares.math.object;

public class Entity {

    int[][][] content;


    public Entity(int x, int y, int z){
        content = new int[y][x][z];
    }



    public void setValue(int x, int y, int z, int value){

        content[x][y][z] = value;

    }

    public int getValue(int x, int y, int z){

        return  content[x][y][z];

    }


}
