package GUI;

import java.util.Random;

public class Board {
    private final static int mapSize=5;
    private final Map[][] map;

    public Board(){
        map = new Map[mapSize][mapSize];
        for(int i=0; i<mapSize; i++){
            for(int j=0; j<mapSize; j++){
                map[i][j] = new Map();
            }
        }
        generateRandomNumber();
        generateRandomNumber();
    }
    public Map getTile(int row, int col){
        return map[row][col];
    }
    public int getMapSize(){
        return mapSize;
    }
    public void displayMap(){
        for(int i=0; i<mapSize; i++){
            for(int j=0; j<mapSize; j++){
                Map t = getTile(i,j);
                t.getLabel().setText(String.valueOf(t.getValue()));
            }
        }
    }

    public boolean endGame(){
        for(int i=0; i<mapSize; i++){
            for(int j=0; j<mapSize; j++){
                if(map[i][j].getValue()==0)
                    return false;
            }
        }
        for(int i=0; i<mapSize; i++){
            for(int j=0; j<mapSize-1; j++){
                if(map[i][j].getValue() == map[i][j+1].getValue() && map[i][j].getValue()!=0 || map[j][i].getValue() == map[j+1][i].getValue() && map[j][i].getValue()!=0 ){
                    return false;
                }
            }
        }
        return true;
    }

    public void generateRandomNumber(){
        Random r = new Random();
        int x,y;
        do{
            x=r.nextInt(mapSize);
            y=r.nextInt(mapSize);
        }while(map[y][x].getValue()!=0);
        int u = r.nextInt(9);
        if(u<=7) map[y][x].setValue(2);
        else map[y][x].setValue(4);
    }
    public void left(){
        boolean positiveMove=false;
        for(int i=0; i<mapSize; i++){
            int counter=0;
            for(int j=0; j<mapSize; j++){
                if(map[i][j].getValue()!=0){
                    map[i][counter].setValue(map[i][j].getValue());
                    if(j!=counter) positiveMove=true;
                    counter++;
                }
            }
            for(int j=counter; j<mapSize; j++) map[i][j].setValue(0);
            for(int j=0; j<mapSize-1; j++){
                if(map[i][j].getValue()==map[i][j+1].getValue() && map[i][j].getValue()!=0){
                    map[i][j].setValue(map[i][j].getValue()*2);
                    map[i][j+1].setValue(0);
                    positiveMove = true;
                }
            }
            counter=0;
            for(int j=0; j<mapSize; j++){
                if(map[i][j].getValue()!=0){
                    map[i][counter].setValue(map[i][j].getValue());
                    if(j!=counter) positiveMove=true;
                    counter++;
                }
            }
            for(int j=counter; j<mapSize; j++) map[i][j].setValue(0);
        }
        if(positiveMove) generateRandomNumber();
        if(endGame()) new GameOver();
    }
    public void right(){
        boolean positiveMove=false;
        for(int i=0; i<mapSize; i++){
            int counter=mapSize-1;
            for(int j=mapSize-1; j>=0; j--){
                if(map[i][j].getValue()!=0){
                    map[i][counter].setValue(map[i][j].getValue());
                    if(j!=counter) positiveMove=true;
                    counter--;
                }
            }
            for(int j=counter; j>=0; j--) map[i][j].setValue(0);
            for(int j=mapSize-1; j>0; j--){
                if(map[i][j].getValue()==map[i][j-1].getValue() && map[i][j].getValue()!=0){
                    map[i][j].setValue(map[i][j].getValue()*2);
                    map[i][j-1].setValue(0);
                    positiveMove=true;
                }
            }
            counter=mapSize-1;
            for(int j=mapSize-1; j>=0; j--){
                if(map[i][j].getValue()!=0){
                    map[i][counter].setValue(map[i][j].getValue());
                    if(j!=counter) positiveMove=true;
                    counter--;
                }
            }
            for(int j=counter; j>=0; j--)map[i][j].setValue(0);
        }
        if(positiveMove) generateRandomNumber();
        if(endGame()) new GameOver();
    }
    public void top(){
        boolean positiveMove=false;
        for(int i=0; i<mapSize; i++){
            int counter=0;
            for(int j=0; j<mapSize; j++){
                if(map[j][i].getValue()!=0){
                    map[counter][i].setValue(map[j][i].getValue());
                    if(j!=counter) positiveMove=true;
                    counter++;
                }
            }
            for(int j=counter; j<mapSize; j++) map[j][i].setValue(0);
            for(int j=0; j<mapSize-1; j++){
                if(map[j][i].getValue()==map[j+1][i].getValue() && map[j][i].getValue()!=0){
                    map[j][i].setValue(map[j][i].getValue()*2);
                    map[j+1][i].setValue(0);
                    positiveMove=true;
                }
            }
            counter=0;
            for(int j=0; j<mapSize; j++){
                if(map[j][i].getValue()!=0){
                    map[counter][i].setValue(map[j][i].getValue());
                    if(j!=counter) positiveMove=true;
                    counter++;
                }
            }
            for(int j=counter; j<mapSize; j++) map[j][i].setValue(0);
        }
        if(positiveMove) generateRandomNumber();
        if(endGame()) new GameOver();
    }
    public void down(){
        boolean positiveMove=false;
        for(int i=0; i<mapSize; i++){
            int counter=mapSize-1;
            for(int j=mapSize-1; j>=0; j--){
                if(map[j][i].getValue()!=0){
                    map[counter][i].setValue(map[j][i].getValue());
                    if(j!=counter) positiveMove=true;
                    counter--;
                }
            }
            for(int j=counter; j>=0; j--) map[j][i].setValue(0);
            for(int j=mapSize-1; j>0; j--){
                if(map[j][i].getValue()==map[j-1][i].getValue() && map[j][i].getValue()!=0){
                    map[j][i].setValue(map[j][i].getValue()*2);
                    map[j-1][i].setValue(0);
                    positiveMove=true;
                }
            }
            counter=mapSize-1;
            for(int j=mapSize-1; j>=0; j--){
                if(map[j][i].getValue()!=0){
                    map[counter][i].setValue(map[j][i].getValue());
                    if(j!=counter) positiveMove=true;
                    counter--;
                }
            }
            for(int j=counter; j>=0; j--)map[j][i].setValue(0);
        }
        if(positiveMove) generateRandomNumber();
        if(endGame()) new GameOver();
    }
}
