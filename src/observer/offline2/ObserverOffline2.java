/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.offline2;

import java.util.*;


interface Message 
{

    void register(Student s);

    void unregister(Student s);

    void notifyStudents();
}



class ObserverPattern {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(); 
        CR cr = new CR();
        cr.register(s1);
        cr.register(s2);
        System.out.println("Setting msg1 ");
        cr.setMsg("abcd");
        System.out.println("Setting msg2 ");
        cr.setMsg("abcdefg");
        cr.unregister(s1);
//No notification this time to s1 .Since it is unregistered.
        System.out.println("Setting msg3 ");
        cr.setMsg("mnop");
    }
}
