package com.syberkeep.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.Stack;

public class GameStateManager {

    private Stack<State> states;    //to hold the game states in a stack

    //constructor
    public GameStateManager(){
        states = new Stack<State>();
    }

    //to add a state to the top
    public void push(State state){
        states.push(state);
    }

    //to remove the state
    public void pop(){
        states.pop().dispose();
    }

    //both pop and push at same time
    public void set(State state){
        states.pop().dispose();
        states.push(state);
    }

    public void update(float dt){
        states.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        states.peek().render(sb);
    }
}