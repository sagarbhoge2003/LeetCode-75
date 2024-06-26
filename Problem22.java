//933. Number of Recent Calls
//https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75
class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000)
            q.poll();
        return q.size();
    }
}