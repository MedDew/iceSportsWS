/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Mehdi
 * Created: 27 févr. 2019
 */

INSERT INTO gender(id, gender_label) VALUES(nextval('gender_seq'), 'masculin'), (nextval('gender_seq'), 'féminin');

INSERT INTO activity(id, activity_label) VALUES(nextval('activity_seq'), 'hockey sur glace'), (nextval('activity_seq'), 'patinage artisitique');