package kata

func Multiple3And5(number int) int {
	var sum int
	for i := 0; i < number; i++ {
		if isMultiple3or5(i) {
			sum += i
		}
	}
	return sum
}

func isMultiple3or5(number int) bool {
	var result bool
	var mod_3 = number % 3
	var mod_5 = number % 5

	if mod_3 == 0 || mod_5 == 0 {
		result = true
	} else {
		result = false
	}
	return result
}
