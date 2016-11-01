Example 6: Enhanced output
--------------------------

__Working directory:__ `/path/to/nshmp-haz/etc/examples/6-enhanced-output`

While mean hazard is of broad interest, it can be useful to preserve individual components of a total curve, particularly with more complex models. Execute the following to write curves for each source type and ground motion model (GMM) used in the 2008 NSHM:

```Shell
hazard ../../../../nshmp-model-cous-2008/Western\ US sites.geojson config.json
```

The [config](https://github.com/usgs/nshmp-haz/blob/master/etc/examples/6-enhanced-output/config.json) file for this example specified `GMM` and `SOURCE` as [output curve types](https://github.com/usgs/nshmp-haz/wiki/Configuration#calculation-configuration-parameters). Note that the output curves directory now contains additional directories of curves by source type and GMM. We also specified an [output flush limit](https://github.com/usgs/nshmp-haz/wiki/Configuration#calculation-configuration-parameters) of `1`. Doing so gives feedback on how long it takes each site calculation to run on a particular system.

See the `nshmp-haz` wiki and JavDocs for more information on source types ([Wiki](https://github.com/usgs/nshmp-haz/wiki/Source-Types), [JavaDoc](http://usgs.github.io/nshmp-haz/javadoc/index.html?org/opensha2/eq/model/SourceType.html)) and GMMs ([Wiki](https://github.com/usgs/nshmp-haz/wiki/Ground-Motion-Models), [JavaDoc](http://usgs.github.io/nshmp-haz/javadoc/index.html?org/opensha2/gmm/Gmm.html)).

#### Next: [Example 7 – Deaggregation](../7-deaggregation)
