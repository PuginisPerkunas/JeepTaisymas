/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DIYProjects.Classes;

/**
 *
 * @author root
 */
public class Jeep {
    private EngineResponder responder;
    private Engine engine;
    
    private static Jeep instance;
    
    private Jeep() {
        try {
            responder = new EngineResponder(new int[] { 4, 5, 1, 13, 12, 26}, null); // 4, 5, 6, 13, 12, 14
            engine = new Engine(responder);
        }
        catch (Exception exc) {
            
        }
    }  
    
    public static Jeep getInstance() {
        if (instance == null) {
            instance = new Jeep();
        }
        return instance;
    }
    
    
    public String speedUp() throws Exception
    {
        if (engine != null)
        {
            try
            {
                int speed = engine.SpeedUp();
                return "{ " + 
                       "\"speed\" : " + speed +
                       " }";
            }
            catch (Exception exc)
            {
                throw new Exception(exc.getMessage());
            }
        }
        else {
            throw new Exception("Engine initialization error");
        }
    }
    
    public String slowSpeed() throws Exception
    {
        if (engine != null)
        {
            try
            {
                int speed = engine.SlowSpeed();
                return "{ " + 
                       "\"speed\" : " + speed +
                       " }";
            }
            catch (Exception exc)
            {
                throw new Exception(exc.getMessage());
            }
        }
        else {
            throw new Exception("Engine initialization error");
        }
    }
    
    public String mediumSpeed() throws Exception
    {
        if (engine != null)
        {
            try
            {
                int speed = engine.MediumSpeed();
                return "{ " + 
                       "\"speed\" : " + speed +
                       " }";
            }
            catch (Exception exc)
            {
                throw new Exception(exc.getMessage());
            }
        }
        else {
            throw new Exception("Engine initialization error");
        }
    }
    
   public String fastSpeed() throws Exception
    {
        if (engine != null)
        {
            try
            {
                int speed = engine.FastSpeed();
                return "{ " + 
                       "\"speed\" : " + speed +
                       " }";
            }
            catch (Exception exc)
            {
            throw new Exception(exc.getMessage());
            }
        }
        else {
            throw new Exception("Engine initialization error");
        }
    }
    
    public String FullSpeed() throws Exception
    {
        if (engine != null)
        {
            try
            {
                int speed = engine.FullSpeed();
                int speed = engine.FastSpeed();
                return "{ " + 
                       "\"speed\" : " + speed +
                       " }";
            }
            catch (Exception exc)
            {
            throw new Exception(exc.getMessage());
            }
        }
        else {
            throw new Exception("Engine initialization error");
        }
    }
    
    public String stop() throws Exception
    {
        if (engine != null)
        {
            try
            {
                engine.Stop();
                return "{ \"speed\" : 0 }";
            }
            catch (Exception exc)
            {
                throw new Exception(exc.getMessage());
            }
        }
        else {
            throw new Exception("Engine initialization error");
        }
    }
}
