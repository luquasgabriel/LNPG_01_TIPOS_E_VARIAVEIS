main :: IO ()
main = do
    putStrLn "Enter the first number:"
    input1 <- getLine
    let x = read input1 :: Double

    putStrLn "Enter the second number:"
    input2 <- getLine
    let y = read input2 :: Double

    let add = x + y
    let sub = x - y
    let multiply = x * y

    if y /= 0
        then do
            let divide = x / y
            putStrLn $ "Addition Result: " ++ show add
            putStrLn $ "Subtraction Result: " ++ show sub
            putStrLn $ "Multiplication Result: " ++ show multiply
            putStrLn $ "Division Result: " ++ show divide
        else
            putStrLn "Cannot divide by zero."