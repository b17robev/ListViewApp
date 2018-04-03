package org.brohede.marcus.listviewapp;

/**
 * Created by Roberth on 3/30/2018.
 */

public class Mountain{
    public String name;
    public int height;
    public String location;
    public String url;

    //Url not needed since image is hard-coded
    public Mountain(String name, int height, String location){
        this.name = name;
        this.height = height;
        this.location = location;
    }

    //Setup getName function, looks like toString gets automatically called when converting to list
    public String getName(){
        return name;
    }

    public String infoText(){
        return name + ", " + height + ", " + location;
    }

    @Override
    public String toString(){
        return name;
    }

}
