public class Main{
    static int lim = 100; // 1~100까지의 제한
    static int n = 5; // 5개만 고른다.
    public static void main(String[] args){
        int[] chosen = new int[n]; // 선택된 숫자가 저장되는 배열
        
        // 시작은 0부터 시작하며 0개를 현재 선택했으니 아래와 같이 parameter 전달!
        solve(chosen, 0, 0);
    }
    
    // chosen은 선택된 숫자가 저장된 배열
    // curr은 현재 숫자를 선택하는 index
    // cnt는 몇 개의 숫자가 선택되었는지 확인
    private static void solve(int[] chosen, int curr, int cnt){
    
        // n개의 숫자를 다 선택했다면 출력 후 더 이상 재귀를 돌지 않아야 한다!
        // 탈출 조건의 정의!
        if(cnt == n){
            for(int i : chosen){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        
        // 반복문을 통해 숫자를 계속 선택!
        for(int i=curr+1; i <= lim; i++){
            // 현재 선택된 숫자를 저장
            chosen[cnt] = i;
            
            // 다음 숫자를 선택하기 위해 재귀 호출
            solve(chosen, curr, cnt+1);
        }
    }
}