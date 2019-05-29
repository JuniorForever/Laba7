package Runner.services;

import Runner.Vectors;
import Runner.businessLogic.VectorMultiplier;
import Runner.exceptions.VectorLengthException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;


@RestController
public class VectorMultiplierService {

    @Autowired
    VectorMultiplier vectorMultiplier;

    @GetMapping(path = "/recursive-vector-multiply", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Integer> recursiveVectorMultiply(@RequestBody Vectors vectors) throws VectorLengthException {
        return  vectorMultiplier.recursiveVectorMultiply(vectors.getVector1(), vectors.getVector2());
    }

    @GetMapping(path = "/not-recursive-vector-multiply", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Collection<Integer> notRecursiveVectorMultiply(@RequestBody Vectors vectors) throws VectorLengthException {

        return  vectorMultiplier.notRecursiveVectorMultiply(vectors.getVector1(), vectors.getVector2());
    }

}
