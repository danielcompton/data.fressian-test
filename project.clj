(defproject data.fressian-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.fressian "0.2.0"]
                 [org.clojure/test.check "0.5.9"]]
  :profiles {:1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.5"]})
