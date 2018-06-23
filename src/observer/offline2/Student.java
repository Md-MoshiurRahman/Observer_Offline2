/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.offline2;

/**
 *
 * @author USER
 */
class Student {

    public boolean update(String msg) {
        System.out.println("msg: "+msg);
        return true;
    }
    
}