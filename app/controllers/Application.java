package controllers;

import models.GenericDAO;
import models.Usuario;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("caiodotdev@gmail.com"));
    }

    public static Result renderregister(int i){
        return ok(register.render(i));
    }

    public static Result renderEscolha(){
        return ok(choose.render("caiodotdev@gmail.com"));
    }

    @Transactional
    public static Result reg(){
        DynamicForm r = Form.form().bindFromRequest();
        String nome = r.get("nome");
        String email = r.get("email");
        int plano = Integer.parseInt(r.get("plano"));
        Usuario u = new Usuario(nome,email,"",plano);
        GenericDAO dao = new GenericDAO();
        dao.persist(u);
        dao.flush();
        return renderEscolha();
    }

    @Transactional
    public static List<Usuario> getlista(){
        GenericDAO dao = new GenericDAO();
        return dao.findAllByClassName(Usuario.class.getName());
    }

    @Transactional
    public static Result renderPanel(){
        return ok(tables.render());
    }

}
