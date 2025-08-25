
(defproject hyperion "0.1.0-SNAPSHOT"
  :description "Hyperion Instance"
  :url "https://github.com/Hose-Monster/hyperion"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot hyperion.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
