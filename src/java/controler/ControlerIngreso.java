/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import modelo.modelo.Persona;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author richards
 */
public class ControlerIngreso {
@RequestMapping(value="ingreso.htm", method=RequestMethod.GET)
public ModelAndView ingreso(){
    return new ModelAndView("ingreso","command", new Persona("uno","dos"));
}
@RequestMapping(value="ingreso.htm",method=RequestMethod.POST)
    public String form(Persona per,ModelMap model)
    {
        model.addAttribute("nombre",per.getNombre());
        model.addAttribute("ap",per.getAp());
        model.addAttribute("am",per.getAm());
        return "exito";
    }
}
