USE globalhands;
ALTER TABLE solicitudes
ADD INDEX idx_solicitudes_usuario (usuario_id);
ALTER TABLE solicitudes
DROP INDEX uq_solicitudes_usuario;
ALTER TABLE solicitudes
ADD CONSTRAINT uq_solicitudes_usuario_voluntariado
UNIQUE (usuario_id, voluntariado_id);

/*NOTA: HE SACADO EL UNIQUE, YA QUE DE ESA MANERA UN USUARIO PODÍA HACER UNA ÚNICA SOLICITUD. AHORA ESTA
CONSULTA DE SQL PARA LA TABLA Solicitudes, hace lo siguiente:

un usuario puede tener varias solicitudes,
   pero no repetir el mismo voluntariado

 */
