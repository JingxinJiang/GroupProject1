/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project.content;

/**
 *
 * @author seanz
 */
public class Player {
    private String user1;
    private String user2;
    public Player(){
        this.user1="Red";
        this.user2="Blue";
    }
    public Player(String user1,String user2 ){
        this.user1=user1;
        this.user2=user2;
    }

    public String getUser1() {
        return user1;
    }

    public String getUser2() {
        return user2;
    }
    
}
