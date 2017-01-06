/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistentie;

import domein.Land;

/**
 *
 * @author Robby
 */
public interface IPersistentieController {
    public int findOppervlakteLanden();
    public Land findLanden(String code);
}
