## Design patterns

### Strategy
Groepering van algoritmen (family) die worden geincapsuleerd zodanig deze onderling kunnen worden uitgewisseld en het mogelijk maakt om algoritmes te wisselen tijdens runtime.

### Observer
subscriptiemodel tussen observer en observed met een one to many relatie, waarbij de OBSERVED (one) de
observers (many) gaat updaten bij verandering van zijn status.

### Singleton
Een enkele objectinstantie die wordt aangemaakt en globaal bereikbaar is.

### Command
Het encapsuleren van een request als object waar parameters aan kunnen worden toegevoegd, dit laat toe om een actie te executen, unexecuten en queue bij te houden.

### Template Method
Definieren van skelet algoritme in superklasse, die toelaat om te worden overschreven door subklasses, zonder structuur van superklasse te veranderen.

### Composite
Opdelen van objecten in een boomstructuur die toelaat clienten objecten te behandelen als individueel of als samengesteld element. Verminderd complexiteit bestaande uit component, lead, composite en client.

### Adapter
Converteren van een interface van een klasse naar een adapterklasse die toelaat om incompatibele Interfaces toch te gebruiken.

### Facade
Bieden van een interface voor een verzameling van interfaces van een subsysteem voor eenvoudiger gebruik.

### Decorator
Inpakken van een klasse met subklasses om dynamisch functionaliteit toe te voegen, zonder code te wijzigen.