package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showCars(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");
        if (count == null) {
            model.addAttribute("messages", CarServiceImpl.cars);
        } else {
            model.addAttribute("messages", CarServiceImpl.listCars(Integer.parseInt(count)));
        }
        return "cars";
    }
}
