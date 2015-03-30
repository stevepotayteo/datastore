(def *agnt* (agent {}))

user=> (send-off *agnt* (fn [state] 
                          (Thread/sleep 10000)
                          (assoc state :done true)))
#<Agent@5db18235: {}>

user=> (await *agnt*) ; blocks till the agent action is finished
nil
