INSERT INTO organizations (id,name) VALUES (1, 'org1');

INSERT INTO users (id, name, created, modified,active, organization_id) VALUES (1, 'ma1', current_date, current_date, TRUE,1);
INSERT INTO users (id, name, created, modified,active,organization_id)  VALUES (2, 'ma2',current_date, current_date, TRUE,1);
INSERT INTO users (id, name, created, modified,active,organization_id)  VALUES (3, 'ma3', current_date, current_date,FALSE,1);
INSERT INTO users (id, name, created, modified,active,organization_id)  VALUES (4, 'ma4', current_date, current_date, FALSE,1);

INSERT INTO rights (id,name) VALUES (1, 'ADMIN');
INSERT INTO rights (id,name) VALUES (2, 'READ');
INSERT INTO rights (id,name) VALUES (3, 'WRITE');

INSERT INTO users_rights (user_entity_id, rights_id) VALUES (1,1);
INSERT INTO users_rights (user_entity_id, rights_id) VALUES (2,2);
INSERT INTO users_rights (user_entity_id, rights_id) VALUES (2,3);
INSERT INTO users_rights (user_entity_id, rights_id) VALUES (3,2);
INSERT INTO users_rights (user_entity_id, rights_id) VALUES (4,2);