# passengerseat.eu

This is the work-in-progress source code for the new version of my personal
website, [passengerseat.eu](http://passengerseat.eu). This code is *not*
deployed anywhere because I haven't reached MVP yet, but I'm still _coding in
the open_, because why not?

# MVP features

- [x] Simple mobile first layout
- [x] Short bio
- [ ] Import Instagram feed
- [ ] Import Twitter feed
- [ ] Show list of talks

# Tech

I could have done this in easier ways, but I wanted an excuse to experiment
with [ClojureScript](https://github.com/clojure/clojurescript)
and [Om.Next](https://github.com/omcljs/om/wiki/Quick-Start-%28om.next%29).

# Running locally

To run the website locally, clone this repo and run

```sh
lein run -m clojure.main script/figwheel.clj
```

Then point your browser at [http://localhost:3449/](http://localhost:3449/)
