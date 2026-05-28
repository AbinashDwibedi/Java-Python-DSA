### 
``` java
class BrowserHistory {
    private List<String> history;
    private int n;
    public BrowserHistory(String homepage) {
        this.history = new ArrayList<>();
        this.n = 0;
        this.history.add(homepage);
    }
    
    public void visit(String url) {
        while(this.history.size() > this.n +1){
            this.history.remove(this.history.size()-1);
        }
        this.history.add(url);
        this.n++;
    }
    
    public String back(int steps) {
        int location = Math.max(0,this.n - steps);
        this.n = location;
        return this.history.get(location);
    }
    
    public String forward(int steps) {
        int location = Math.min(this.history.size()-1, this.n + steps);
        this.n = location;
        return this.history.get(location);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
```
