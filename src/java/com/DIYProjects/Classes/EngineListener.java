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
public interface EngineListener {
    void onStop();
    int onSpeedDown();
    int onSpeedUp();
    void onBackwards();
    void onForward();
    int onSlowSpeed();
    int onMediumSpeed();
    int onFastSpeed();
    int onFullSpeed();

    int onSpeed();
}
