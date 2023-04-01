packagecom.example.demo;

importorg.springframework.beans.factory.annotation.Autowired;
importorg.springframework.web.bind.annotation.GetMapping;
importorg.springframework.web.bind.annotation.PostMapping;
importorg.springframework.web.bind.annotation.RequestBody;
importorg.springframework.web.bind.annotation.RequestMapping;
importorg.springframework.web.bind.annotation.RestController;

importcom.example.demo.service.NameService;

importjava.util.*;

@RestController
@RequestMapping("/names")
public class NameController {

private final NameServicenameService;

    @Autowired
publicNameController(NameServicenameService) {
this.nameService = nameService;
    }

    @GetMapping
public List<String>getNames() {
returnnameService.getNames();
    }

    @PostMapping
public void addName(@RequestBody String name) {
nameService.addName(name);
    }

}

packagecom.example.demo.service;


importorg.springframework.stereotype.Service;

importjava.util.*;

@Service
public class NameService {

private static List<String> names = new ArrayList<>();

public List<String>getNames() {
return names;
    }

public void addName(String name) {
names.add(name);
    }

}


 


