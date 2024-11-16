package com.example.ProyectoIII;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.ProyectoIIII.api.TransaccionesApiDelegate;
import com.example.ProyectoIIII.model.RespuestaTransaccion;
@Service
public class ApiDelegateImpl implements TransaccionesApiDelegate {

    public ResponseEntity<TransaccionesApiDelegate> transaccion(){
       /* RespuestaTransaccion transaccion= new RespuestaTransaccion();
        transaccion.setDestinationAccountId();  */
        return transaccion();

    }
}
